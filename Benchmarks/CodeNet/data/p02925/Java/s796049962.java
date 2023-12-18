import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n*n;
        int[][] v = new int[n][n];
        int[] in = new int[m];
        int[] out = new int[m];
        int[][] next = new int[m][2];
        int[] d = new int[m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {
                int b  = sc.nextInt() - 1;
                int key = key(i, b, n);
                v[i][j] = key;
                if(j>0) {
                    int pkey = v[i][j-1];
                    int ind = key < pkey ? 0 : 1;
                    next[pkey][out[pkey]] = key;
                    out[pkey]++;
                    in[key]++;
                }
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        int res = 0;
        for(int i=0; i<m; i++) {
            if(in[i] == 0) {
                q.add(i);
                d[i] = 1;
                res = 1;
            }
        }
        while(!q.isEmpty()) {
            int p = q.poll();
            for(int i=0; i<out[p]; i++) {
                int np = next[p][i];
                d[np] = Math.max(d[np], d[p] + 1);
                res = Math.max(res, d[np]);
                in[np]--;
                if(in[np] == 0) {
                    q.offer(np);
                }
            }
        }

        for(int i=0; i<m; i++) {
            if(in[i] > 0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(res);

    }

    static int key(int a, int b, int n) {
        return Math.max(a, b) * n + Math.min(a, b);
    }

}
