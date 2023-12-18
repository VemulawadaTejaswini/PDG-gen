
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n-1];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {
                a[i][j] = sc.nextInt() - 1;
            }
        }

        int[] p = new int[n];
        int fc = 0;
        int res = 0;

        while(true) {
            res++;
            boolean[] v = new boolean[n];
            int c = 0;
            for(int i=0; i<n; i++) {
                int x = i;
                if(v[x] || p[x] == n - 1) continue;
                int y = a[i][p[i]];
                if(v[y] || a[y][p[y]] != x) continue;
                v[x] = v[y] = true;
                p[x]++;
                p[y]++;
                if(p[x] == n-1) fc++;
                if(p[y] == n-1) fc++;
                c++;
            }
            if(c == 0) {
                System.out.println(-1);
                return;
            }
            if(fc == n) break;
        }
        System.out.println(res);
    }


}
