import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i;

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;

        int m = (int) (Math.log(n + 1) / Math.log(2));
        int[] G = new int[m];
        for (i = 0; i < m; i++) {
            G[i] = (int) Math.pow(2, m - i) - 1;
        }

        int j, k, g, v;

        for (i = 0; i < m; i++) {
            g = G[i];
            for (j = g; j < n; j++) {
                v = A[j];
                k = j - g;
                while (k >= 0 && A[k] > v) {
                    A[k + g] = A[k];
                    k = k - g;
                    cnt++;
                }
                A[k + g] = v;
            }
        }

        System.out.println(m);
        for (i = 0; i < m; i++) {
            System.out.print(G[i] + (i == m - 1 ? "\n" : " "));
        }
        System.out.println(cnt);
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}