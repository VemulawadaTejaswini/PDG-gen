import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        Pair<Integer, Integer>[] pairs = new Pair[N];
        for(int i = 0 ; i < N ; i++) {
            Pair<Integer,Integer> p = new Pair<Integer,Integer>();
            s = stdR.readLine().split(" ");
            p.setSecond(Integer.parseInt(s[0]));
            p.setFirst(Integer.parseInt(s[1]));
            pairs[i] = p;
        }
        Arrays.sort(pairs);
        long time = 0;
        boolean ok = true;
        for(int i = 0 ; i < N ; i++) {
            time += pairs[i].getSecond();
            if(time > pairs[i].getFirst()) {
                ok = false;
                break;
            }
        }
        if(ok) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}

class Pair<S, T> implements Cloneable,Comparable<Pair<?, ?>>, Serializable {
    private static final long serialVersionUID = -553348920790587668L;
    @Override
    public Pair<?, ?> clone() {
        try {
            return (Pair<?, ?>) super.clone();
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
    @SuppressWarnings("unchecked")
    public Pair(Pair<?, ?> p) {
        first = (S) p.getFirst();
        second = (T) p.getSecond();
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
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (!(obj instanceof Pair)) { return false; }
        Pair<?, ?> pair = (Pair<?, ?>) obj;
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
    public int compareTo(Pair<?, ?> o) {// Comparable>
        Comparable f = null;
        Comparable s = null;
        try {
            f = (Comparable) first;
            s = (Comparable) second;
        } catch (ClassCastException e) {
            throw new IllegalStateException(e);
        }
        if (f == null || s == null || o == null) throw new NullPointerException();
        int c = f.compareTo(o.first);
        if (c != 0) {return c; }
        return s.compareTo(o.second);
    }
}