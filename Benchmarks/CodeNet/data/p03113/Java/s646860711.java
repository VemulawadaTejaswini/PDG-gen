import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.io.Serializable;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        s = stdR.readLine().split(" ");
        int[] a = new int[N];
        int sum = 0;
        ArrayList array = new ArrayList<Integer>();
        Pair[] p = new Pair[N];
        for(int i = 0 ; i < N; i++) {
            a[i] = Integer.parseInt(s[i]);
            sum += a[i];
            Pair pt = new Pair<Integer, Integer>();
            pt.setFirst(a[i]);
            pt.setSecond(i);
            p[i] = pt;
        }
        Arrays.sort(p);
        if(sum < K + 1) {
            System.out.println("-1");
        }else {
            System.out.println(sum);
            while(true) {
                boolean isok = true;
                ArrayList<Integer> ars = new ArrayList<Integer>();
                for(int i = N - 1 ; i >= 0 ; i--) {
                    if(Integer.parseInt(p[i].getFirst().toString()) == 0) {
                        isok = false;
                        break;
                    }else {
                        ars.add(Integer.parseInt(p[i].getSecond().toString()) + 1);
                        p[i].setFirst(Integer.parseInt(p[i].getFirst().toString()) - 1);
                    }
                }
                boolean[] br = new boolean[ars.size()];
                int rc = 0;
                while(rc != br.length) {
                    Random rand = new Random();
                    int rd = rand.nextInt(br.length);
                    if(!br[rd]) {
                        br[rd] = true;
                        array.add(ars.get(rd));
                        rc++;
                    }
                }
                if(!isok)break;
            }
            for(int i = 0 ; i < array.size(); i++) {
                if(i != array.size() - 1) {
                	System.out.print(array.get(i)+" ");
                }else {
                    System.out.println(array.get(i));
                }
            }
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
