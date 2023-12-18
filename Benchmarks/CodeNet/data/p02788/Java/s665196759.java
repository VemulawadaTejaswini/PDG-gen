import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextInt();
        long a = sc.nextInt();
        E[] e = new E[n];
        for(int i=0 ;i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            e[i] = new E(x, (y+a-1)/a);
        }
        Arrays.sort(e);
        long res = 0;
        long pow = 0;
        Queue<E> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            while (!q.isEmpty()) {
                E entry = q.peek();
                if (e[i].x - entry.x > d * 2) {
                    pow -= entry.h;
                    q.poll();
                } else {
                    break;
                }
            } if (e[i].h > pow) {
                res += e[i].h - pow;
                q.add(new E(e[i].x, e[i].h - pow));
                pow += e[i].h - pow;
            }
        }


        System.out.println(res);


    }

    static class E implements Comparable {
        long x;
        long h;
        public E (long x, long h) {
            this.x = x;
            this.h = h;
        }

        @Override public int compareTo(Object o) {
            return Long.compare(x, ((E)o).x);
        }
    }

}
