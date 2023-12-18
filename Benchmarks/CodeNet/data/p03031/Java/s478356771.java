import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] s = new boolean[n][m];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt()-1;
                s[a][i] = true;
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 1<<n; i++) {
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                if((i>>j & 1) != 1) continue;
                for (int k = 0; k < m; k++) {
                    if(s[j][k]) b[k]++;
                }
            }
            boolean able = true;
            for (int j = 0; j < m; j++) {
                if(b[j]%2 != p[j]){
                    able = false;
                    break;
                }
            }
            if(able) ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}
