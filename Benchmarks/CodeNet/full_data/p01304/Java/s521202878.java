import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int o=sc.nextInt();
        for (int i = 0; i < o; i++) {
            int gx=sc.nextInt();
            int gy=sc.nextInt();
            int[][][] road=new int[gx+1][gy+1][2];
            int p=sc.nextInt();
            for (int j = 0; j < p; j++) {
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                if(x1==x2){
                    road[x1][max(y1,y2)][1]=1;
                }else{
                    road[max(x1,x2)][y1][0]=1;
                }
            }
            long[][] step=new long[gx+1][gy+1];
            step[0][0]=1;
            for (int x = 1; x <= gx; x++) {
                if(road[x][0][0]==1)break;
                step[x][0]=1;
            }
            for (int y = 1; y <= gy; y++) {
                if(road[0][y][1]==1)break;
                step[0][y]=1;
            }
            int[] dx={-1,0};
            int[] dy={0,-1};
            for (int y = 1; y <= gy; y++) {
                for (int x = 1; x <= gx; x++) {
                    for (int j = 0; j < 2; j++) {
                        int X=x+dx[j];
                        int Y=y+dy[j];
                        if(road[x][y][j]==0){
                            step[x][y]+=step[X][Y];
                        }
                    }
                }
            }
            out.println(step[gx][gy]==0?"Miserable Hokusai!":step[gx][gy]);
        }
    }
}
