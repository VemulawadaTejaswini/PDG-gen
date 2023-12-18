import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        Pair<Integer,Integer,Integer>[] pairs_c = new Pair[N];
        Pair<Integer,Integer,Integer>[] pairs_a = new Pair[N];
        boolean[] used = new boolean[N];
        for(int i = 0 ; i < N ; i++) {
            String[] str = stdR.readLine().split(" ");
            Pair p = new Pair();
            p.setFirst(Integer.parseInt(str[0]));
            p.setSecond(i);
            p.setThird(Integer.parseInt(str[1]));
            pairs_c[i] = p;
            
            p = new Pair();
            p.setFirst(Integer.parseInt(str[1]));
            p.setSecond(i);
            p.setThird(Integer.parseInt(str[0]));
            pairs_a[i] = p;
        }

        int[] c = new int[N];
        int[] a = new int[N];
        Arrays.sort(pairs_c);
        Arrays.sort(pairs_a);
        
        for(int i = 0 ; i < N ; i++) {
            c[pairs_c[i].getSecond()] = pairs_c[i].getFirst();
            a[pairs_a[i].getSecond()] = pairs_a[i].getFirst();
        }
        
        long chokudai = 0;
        long akensho = 0;
        int count = 0;
        int c_index = N - 1;
        int a_index = N - 1;
        while(count != N) {
            while(true) {
                if(!used[pairs_a[c_index].getSecond()]) {
                    used[pairs_a[c_index].getSecond()] = true;
                    chokudai += c[pairs_a[c_index].getSecond()];
                    count++;
                    break;
                }
                c_index--;
            }
            
            if(count == N)break;
            
            while(true) {
                if(!used[pairs_c[a_index].getSecond()]) {
                    used[pairs_c[a_index].getSecond()] = true;
                    akensho += a[pairs_c[a_index].getSecond()];
                    count++;
                    break;
                }
                a_index--;
            }
        }
        System.out.println(chokudai-akensho);
    }
}

class Pair<S, T, U> implements Cloneable,Comparable<Pair<?, ?, ?>>, Serializable {
    private static final long serialVersionUID = -553348920790587668L;
    @Override
    public Pair<?, ?, ?> clone() {
        try {
            return (Pair<?, ?, ?>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }
    public Pair(){//S first, T second) {
        //this.first = first;
        //this.second = second;
        //return;
    }
    private S first;
    private T second;
    private U third;
    @SuppressWarnings("unchecked")
    public Pair(Pair<?, ?, ?> p) {
        first = (S) p.getFirst();
        second = (T) p.getSecond();
        third = (U) p.getThird();
    }
    public S getFirst() {
        return first;
    }
    public void setFirst(S first) {
        this.first = first;
    }
    public T getSecond() {
        return second;
    }
    public void setSecond(T second) {
        this.second = second;
    }
 
    public U getThird() {
        return third;
    }
    public void setThird(U Third) {
        this.third = Third;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (!(obj instanceof Pair)) { return false; }
        Pair<?, ?, ?> pair = (Pair<?, ?, ?>) obj;
        if (first == null) {
            if (second == null) {
                if (pair.first == null && pair.second == null) { return true; }
                return false;
            }
            if (pair.first == null) { return second.equals(pair.second); }
            return false;
        }
        if (second == null) {
            if (first != null) {
                if (pair.second == null) { return first.equals(pair.first); }
                return false;
            }
        }
        return first.equals(pair.first) && second.equals(pair.second);
    }
    /**
     * hashcode
     */
    @Override
    public int hashCode() {
        int result = 17;
        result *= 31;
        if (first != null) {
            result += first.hashCode();
        }
        result *= 31;
        if (second != null) {
            result += second.hashCode();
        }
        return result;
    }
    @Override
    public String toString() {
        return "[" + (first != null ? first : "null") + ", " + (second != null ? second : "null") + "]";
    }
    @SuppressWarnings("unchecked")
    public int compareTo(Pair<?, ?, ?> o) {// Comparable>
        Comparable f = null;
        Comparable s = null;
        try {
            f = (Comparable) first;
            s = (Comparable) third;
        } catch (ClassCastException e) {
            throw new IllegalStateException(e);
        }
        if (f == null || s == null || o == null) throw new NullPointerException();
        int c = f.compareTo(o.first);
        if (c != 0) {return c; }
        return s.compareTo(o.third);
    }
}
