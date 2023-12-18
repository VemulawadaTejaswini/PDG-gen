import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Pair[] a = new Pair[n];
        Map<Pair, Integer> counts = new HashMap<Pair, Integer>();
        TreeSet<Pair> vals = new TreeSet<Pair>();
        for(int i=0; i<n; i++) {
          st = new StringTokenizer(bf.readLine());
          int x = Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
          a[i] = new Pair(x, y);
          Pair rev= new Pair(y, x);
          if(!counts.containsKey(rev)) counts.put(rev, 0);
          counts.put(rev, counts.get(rev)+1);
          vals.add(rev);
        }
        Arrays.sort(a);
        long ans = 0; int cur = m;
        for(int i=0; i<n; i++) {
          if(a[i].a > cur) {
            Pair rr = new Pair(a[i].b, a[i].a);
            counts.put(rr, counts.get(rr)-1);
            if(counts.get(rr) == 0)
              vals.remove(rr);

          }
          else {
            Pair rr = vals.first();
            ans += (vals.first()).a;
            counts.put(rr, counts.get(rr)-1);
            if(counts.get(rr) == 0)
              vals.remove(rr);
            cur--;
          }
        }
        out.println(ans);
        out.close(); System.exit(0);
    }

}
class Pair implements Comparable<Pair> {
  public int a;
  public int b;
  public Pair(int a, int b) {
    this.a = a;
    this.b = b;
  }
  @Override
  public boolean equals(Object o) {
    Pair p = (Pair)o;
    return (this.compareTo(p) == 0);
  }

  @Override
  public int hashCode() {
    return (int)((1L*a*103948902382L+b) % 1000000007);
  }

  @Override
  public int compareTo(Pair p) {
    if(this.a < p.a) return 1;
    if(this.a > p.a) return -1;
    if(this.b < p.b) return 1;
    if(this.b > p.b) return -1;
    return 0;
  }
}
