import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {
                a[i][j] = sc.nextInt() - 1;
            }
            a[i][n-1] = -1;
        }


        int[] p = new int[n];
        int fc = 0;
        int res = 0;

        ArrayList<P> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = i;
            int y = a[x][0];
            if(x > y) continue;
            if(a[y][0] != x) continue;
            list.add(new P(x, y));
        }


        while(true) {
            res++;
            if(list.isEmpty()) {
                System.out.println(-1);
                return;
            }
            ArrayList<P> next = new ArrayList<>();
            ArrayList<Integer> num = new ArrayList<>();
            for(P pp : list) {
                int x = pp.a;
                int y = pp.b;
                p[x]++;
                p[y]++;
                if (p[x] == n - 1)
                    fc++;
                if (p[y] == n - 1)
                    fc++;
                num.add(x);
                num.add(y);
            }
            if(fc == n) break;
            boolean[] v = new boolean[n];
            for(int x : num) {
                if(v[x] || p[x] == n - 1) continue;
                int y = a[x][p[x]];
                if(v[y]) continue;
                if (a[y][p[y]] == x) {
                    next.add(new P(x, y));
                }
                v[x] = v[y] = true;
            }
            list = next;
        }
        System.out.println(res);
    }

    static class P {
        int a;
        int b;
        public P(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

}
