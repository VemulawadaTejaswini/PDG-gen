import java.util.*;

public class Main{

    int gx,gy,p;
    int[][][][] m;
    int[][] cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            gx = sc.nextInt();
            gy = sc.nextInt();
            p = sc.nextInt();
            m = new int[gy+1][gx+1][gy+1][gx+1];
            for(int i=0; i<p; i++){
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                m[y1][x1][y2][x2] = 1;
                m[y2][x2][y1][x1] = 1;
            }

            cnt = new int[gy+1][gx+1];
            cnt[0][0] = 1;
            for(int j=0; j<=gx; j++){
                for(int i=0; i<=gy; i++){
                    if(j-1>=0 && m[i][j][i][j-1]==0) cnt[i][j] += cnt[i][j-1];
                    if(i-1>=0 && m[i][j][i-1][j]==0) cnt[i][j] += cnt[i-1][j];
                }
            }

            if(cnt[gy][gx]==0) System.out.println("Miserable Hokusai!");
            else System.out.println(cnt[gy][gx]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}