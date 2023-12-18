import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            g[l]++;
            if(r < n-1) g[r+1]--;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(0 < i) g[i] += g[i-1];
            if(g[i] == m) ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}
