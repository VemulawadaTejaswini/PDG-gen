import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;

        int[][] dis = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    dis[i][j] = 2 * n;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int dist = 1;
            for (int j = i + 1; j < n; j++) {
                dis[i][j] = Math.min(dis[i][j], dist);
                dist++;
            }
            int dist2 = (x >= i)?x - i + 1:i - x + 1;
            if(dist2 > 0) {
                for (int k = y; k < n; k++) {
                    dis[i][k] = Math.min(dis[i][k], dist2);
                    dist2++;
                }
                dist2 = (x >= i)?x - i + 1:i - x + 1;
                for (int k = y; k >= 0; k--) {
                    dis[i][k] = Math.min(dis[i][k], dist2);
                    dist2++;
                }
            }   
            dist2 = (y >= i)?y - i + 1:i - y + 1;
            if (dist2 > 0) {
                for (int k = x; k < n; k++) {
                    dis[i][k] = Math.min(dis[i][k], dist2);
                    dist2++;
                }
                dist2 = (y >= i)?y - i + 1:i - y + 1;
                for (int k = x; k >= 0; k--) {
                    dis[i][k] = Math.min(dis[i][k], dist2);
                    dist2++;
                }
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans[dis[i][j]]++;
            }
        }
        for(int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}