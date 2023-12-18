import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] pos = new long[n];
        List<E>[] le = new List[n];
        List<E>[] re = new List[n];
        for(int i=0; i<n; i++) {
            pos[i] = Long.MAX_VALUE;
            le[i] = new ArrayList<E>();
            re[i] = new ArrayList<E>();
        }
        for(int i=0; i<m; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int d = sc.nextInt();
            E e = new E(l, r, d);
            le[l].add(e);
            re[r].add(e);
         }

         for(int i=0; i<n; i++) {
             if (pos[i] == Long.MAX_VALUE) {
                 Queue<Integer> q = new LinkedList<>();
                 q.add(i);
                 pos[i] = 0;
                 while (!q.isEmpty()) {
                     int a = q.poll();
                     for (E e : le[a]) {
                         if (e.v)
                             continue;
                         e.v = true;
                         if (pos[e.r] == Long.MAX_VALUE) {
                             q.add(e.r);
                             pos[e.r] = pos[a] + e.d;
                         } else {
                             if (pos[a] + e.d != pos[e.r]) {
                                 System.out.println("No");
                                 return;
                             }
                         }
                     }
                     for (E e : re[a]) {
                         if (e.v)
                             continue;
                         e.v = true;
                         if (pos[e.l] == Long.MAX_VALUE) {
                             q.add(e.l);
                             pos[e.l] = pos[a] - e.d;
                         } else {
                             if (pos[a] - e.d != pos[e.l]) {
                                 System.out.println("No");
                                 return;
                             }
                         }
                     }
                 }
             }
         }
         System.out.println("Yes");
    }

    private static class E {
        public int l;
        public int r;
        public int d;
        public boolean v = false;
        public E(int l, int r, int d) {
            this.l = l;
            this.r = r;
            this.d = d;
        }
    }
}
