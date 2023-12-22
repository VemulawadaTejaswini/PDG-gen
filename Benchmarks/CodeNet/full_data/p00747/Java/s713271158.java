import java.util.*;

public class Main{

    static int[][] dir4 = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0 && h == 0)break;
            int[][] g = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w-1; j++) {
                    int a = sc.nextInt();
                    if(a == 1){
                        g[i][j] |= 1<<1; g[i][j+1] |= 1<<3;
                    }
                }
                if(i == h-1)break;
                for (int j = 0; j < w; j++) {
                    int a = sc.nextInt();
                    if(a == 1){
                        g[i][j] |= 1<<2; g[i+1][j] |= 1;
                    }
                }
            }
            int[][] d = new int[h][w];
            for (int i = 0; i < h; i++) {
                Arrays.fill(d[i], -1);
            }
            d[0][0] = 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(0);
            while(!q.isEmpty()){
                int nex = q.poll();
                int ch = nex/100; int cw = nex%100;
                for (int i = 0; i < 4; i++) {
                    if((g[ch][cw] >> i & 1) == 1)continue;
                    int nh = ch+dir4[i][1]; int nw = cw+dir4[i][0];
                    if(nh < 0 || h-1 < nh || nw < 0 || w-1 < nw) continue;
                    if(0 <= d[nh][nw])continue;
                    d[nh][nw] = d[ch][cw]+1;
                    q.add(nh*100 + nw);
                }
            }
            if(d[h-1][w-1] < 0) d[h-1][w-1] = 0;
            sb.append(d[h-1][w-1] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

