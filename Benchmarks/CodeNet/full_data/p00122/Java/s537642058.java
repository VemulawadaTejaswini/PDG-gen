import java.util.*;

public class Main {

    static int[] sx;
    static int[] sy;
    static int[] nx = {-1, 0, 1, -2, 2, -2, 2, -2, 2, -1, 0, 1};
    static int[] ny = {-2, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2, 2};
    static boolean flag = false;

    static void dfs(int n, int d, int px, int py){
        if(d == n){
            flag = true;
            return;
        }else{
            int x = sx[d];
            int y = sy[d];
            for(int k = 0; k < 12; k++){  // ぴょん吉の移動先
                int nextx = px + nx[k];
                int nexty = py + ny[k];
                if(nextx < 0 || nextx >= 10 || nexty < 0 || nexty >= 10) continue;
                for(int i = -1; i <= 1; i++){
                    for(int j = -1; j <= 1; j++){   // 噴水の届く範囲
                        int wx = x + i;
                        int wy = y + j;
                        if(wx < 0 || wx >= 10 || wy < 0 || wy >= 10) continue;
                        if(nextx == wx && nexty == wy){
                            dfs(n, d + 1, nextx, nexty);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       while(true){
           int px = sc.nextInt();
           int py = sc.nextInt();
           if(px + py == 0) break;
           flag = false;
           int n = sc.nextInt();
           sx = new int[n];
           sy = new int[n];
           for(int i = 0; i < n; i++){
               sx[i] = sc.nextInt();
               sy[i] = sc.nextInt();
           }
           dfs(n, 0, px, py);
           if(flag){
               System.out.println("OK");
           }else{
               System.out.println("NA");
           }
       }
   }
}
