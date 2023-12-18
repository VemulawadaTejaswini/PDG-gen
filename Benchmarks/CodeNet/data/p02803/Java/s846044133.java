import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int [][] List = new int [H][W];
        for(int i=0;i<H;i++){
            String s = sc.next();
            for(int j=0;j<W;j++){
                if(s.charAt(j)=='.') List[i][j]=1;
                else List[i][j]=0;
            }
        }
        int max = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                int [][] Dis = new int [H][W];
                for(int k=0;k<H;k++)Arrays.fill(Dis[k],999999999);
                Dis[i][j]=0;
                Dis = Dijkstra(List,Dis,H,W,i,j);
                for(int k=0;k<H;k++)  for(int n=0;n<W;n++) if(max<Dis[k][n]) max = Dis[k][n];
            }
        }
        System.out.println(max);
    }
    public static int [][] Dijkstra(int [][] List,int [][] Dis,int H,int W,int now_r, int now_c){
        if(now_r!=0){
            if(List[now_r-1][now_c]==1) {
                if (Dis[now_r][now_c] + 1 < Dis[now_r - 1][now_c]) {
                    Dis[now_r - 1][now_c] = Dis[now_r][now_c] + 1;
                    Dis = Dijkstra(List, Dis, H, W, now_r - 1, now_c);
                }
            }
        }
        if(now_r!=H-1){
            if(List[now_r+1][now_c]==1) {
                if (Dis[now_r][now_c] + 1 < Dis[now_r + 1][now_c]) {
                    Dis[now_r + 1][now_c] = Dis[now_r][now_c] + 1;
                    Dis = Dijkstra(List, Dis, H, W, now_r + 1, now_c);
                }
            }
        }
        if(now_c!=0){
            if(List[now_r][now_c-1]==1) {
                if (Dis[now_r][now_c] + 1 < Dis[now_r][now_c - 1]) {
                    Dis[now_r][now_c - 1] = Dis[now_r][now_c] + 1;
                    Dis = Dijkstra(List, Dis, H, W, now_r, now_c - 1);
                }
            }
        }
        if(now_c!=W-1){
            if(List[now_r][now_c+1]==1) {
                if (Dis[now_r][now_c] + 1 < Dis[now_r][now_c + 1]) {
                    Dis[now_r][now_c + 1] = Dis[now_r][now_c] + 1;
                    Dis = Dijkstra(List, Dis, H, W, now_r, now_c + 1);
                }
            }
        }
        return Dis;
    }
}
