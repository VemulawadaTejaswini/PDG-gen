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
        int zc = g[0][0] ? 0 : 1;
        int zf = g[0][0] ? 0 : 1;
        q.add(new int[]{0, 0, zc, zf});
        int[][] cost = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(cost[i], 10000);
        }
        cost[0][0] = zc;
        while(!q.isEmpty()){
            int r = q.peek()[0];
            int c = q.peek()[1];
            int co = q.peek()[2];
            int f = q.poll()[3];
            if(r < h-1){
                int nco = co;
                int nf = f;
                if(f == 0 && !g[r+1][c]){
                    nco++;
                    nf = 1;
                }else if(f == 1 && g[r+1][c]){
                    nf = 0;
                }
                if(nco < cost[r+1][c]) cost[r+1][c] = nco;
                q.add(new int[]{r+1, c, nco, nf});
            }
            if(c < w-1){
                int nco = co;
                int nf = f;
                if(f == 0 && !g[r][c+1]){
                    nco++;
                    nf = 1;
                }else if(f == 1 && g[r][c+1]){
                    nf = 0;
                }
                if(nco < cost[r][c+1]) cost[r][c+1] = nco;
                q.add(new int[]{r, c+1, nco, nf});
            }
        }
        System.out.println(cost[h-1][w-1]);
        sc.close();

    }

}
