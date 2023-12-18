import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();

    if (b > a){
      long g = b;
      b = a;
      a = g;
    }

    ArrayList<Long> c = new ArrayList<Long>();
    ArrayList<Long> d = new ArrayList<Long>();

    long a1 = (long) Math.sqrt(a);
    long b1 = (long) Math.sqrt(b);

    long a2 = a1;
    long b2 = b1;

    if (a1*a1 == a){
        a2 -= 1;
        c.add(a1);
    }

    if (b1*b1 == b){
        b2 -= 1;
        d.add(b1);
    }

    for (int i = (int) a2; i>=1;i--){
      if (a%i == 0){
        c.add((long) i);
        long t = (long) a/i;
        c.add(t);
      }
    }

    for (int i = (int) b2; i>=1;i--){
      if (b%i == 0){
        d.add((long) i);
        long t = (long) b/i;
        d.add(t);
      }
    }

    ArrayList<Long> f = new ArrayList<Long>();
    for (long gg : c){
      if (d.contains(gg)){
        f.add(gg);
      }
    }
    Collections.sort(f);

    int n = f.size();
    HashSet<Long> m = new HashSet<Long>();
    m.add((long) 1);
    int sum = kk(f,m,1,n);

    System.out.println(sum);





  }

  static long find(long a, long b){
    while (b > 0){
      long remain = (long) a%b;
      a = b;
      b = remain;
    }
    return a;
  }

  static int check(HashSet<Long> a, long b){
    for (long g : a){
      if (find(g,b) != 1){
        return 0;
      }
    }
    return 1;
  }

  static int kk(ArrayList<Long> a, HashSet<Long> b, int current, int n){
    if (current == n){
      return b.size();
    }

    long t = a.get(current);
    if (check(b,t) == 0){
      return kk(a,b,current+1,n);
    }
    else{
      HashSet<Long> m = new HashSet<Long>();
      for (long o : b){
        m.add(o);
      }
      m.add(t);
      int a2 = kk(a,m,current+1,n);
      return a2;
    }
  }

}
