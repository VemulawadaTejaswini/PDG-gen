import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] g = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] a = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(a[j] == '.') g[i][j] = true;
            }
        }
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        int[][] cost = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(cost[i], 10000);
        }
        cost[0][0] = g[0][0] ? 0 : 1;
        boolean[][] used = new boolean[h][w];
        while(!q.isEmpty()){
            int r = q.peek()[0];
            int c = q.poll()[1];
            if(r < h-1){
                int nco = cost[r][c];
                if(g[r][c] && !g[r+1][c]){
                    nco++;
                }
                if(nco < cost[r+1][c]) cost[r+1][c] = nco;
                if(!used[r+1][c]){
                    q.add(new int[]{r+1, c});
                    used[r+1][c] = true;
                }
            }
            if(c < w-1){
                int nco = cost[r][c];
                if(g[r][c] && !g[r][c+1]){
                    nco++;
                }
                if(nco < cost[r][c+1]) cost[r][c+1] = nco;
                if(used[r][c+1])continue;
                q.add(new int[]{r, c+1});
                used[r][c+1] = true;
            }
        }
        System.out.println(cost[h-1][w-1]);
        sc.close();

    }

}
