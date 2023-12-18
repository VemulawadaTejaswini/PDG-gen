 import java.util.*;

 public class Main {
     public static void main(String[] args) {
         new Main().execute();
     }

     public void execute() {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int q = sc.nextInt();

         long[] s = new long[a];
         for (int i = 0; i < a; i++) {
             s[i] = sc.nextLong();
         }
         Arrays.sort(s);

         long[] t = new long[b];
         for (int i = 0; i < b; i++) {
             t[i] = sc.nextLong();
         }
         Arrays.sort(t);

         for (int i = 0; i < q; i++) {
             long x = sc.nextLong();

             long d = Long.MAX_VALUE;

             d = Math.min(d, search(s, t, x));
             d = Math.min(d, search(t, s, x));

             System.out.println(d);
         }
     }

     private long search (long[] s, long[] t, long x) {
         long d = Long.MAX_VALUE;

         D[] xs = dist(s, x);

         D[] s0t = dist(t, xs[0].p);
         d = Math.min(d, xs[0].d + s0t[0].d);

         if (s0t[1] != null) {
             d = Math.min(d, xs[0].d + s0t[1].d);
         }

         if (xs[1] != null) {
             D[] s1t = dist(t, xs[1].p);
             d = Math.min(d, xs[1].d + s1t[0].d);

             if (s1t[1] != null) {
                 d = Math.min(d, xs[1].d + s1t[1].d);
             }
         }
         return d;
     }

     private D[] dist(long[] m, long x) {

         D[] d = new D[2];
         int r = ~(Arrays.binarySearch(m, x));

         if (r == 0) {
             d[0] = new D(Math.abs(x - m[r]), m[r]);
             d[1] = null;
         } else if (r == m.length) {
             d[0] = new D(Math.abs(x - m[r - 1]), m[r - 1]);
             d[1] = null;
         } else {
             d[0] = new D(Math.abs(x - m[r]), m[r]);
             d[1] = new D(Math.abs(x - m[r - 1]), m[r - 1]);
         }

         return d;
     }

     class D {
         long d;
         long p;

         D (long d, long p) {
             this.d = d;
             this.p = p;
         }
     }
 }