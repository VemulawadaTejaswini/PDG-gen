import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int[][] g = new int[h*w+1][2];
        for (int i = 0; i < h; i++) {
            int y = i+1;
            for (int j = 0; j < w; j++) {
                int x = j+1;
                int a = sc.nextInt();
                g[a][0] = x;
                g[a][1] = y;
            }
        }
        int q = sc.nextInt();
        int[] L = new int[q], R = new int[q];
        for (int i = 0; i < q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        long[] s = new long[h*w+1];
        for (int i = d+1; i <= h*w; i++) {
            long b = Math.abs(g[i][0] - g[i-d][0]) + Math.abs(g[i][1] - g[i-d][1]);
            s[i] = s[i-d] + b;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            long t = s[R[i]] - s[L[i]];
            sb.append(t + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
