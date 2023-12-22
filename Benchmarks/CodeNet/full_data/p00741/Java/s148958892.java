import java.util.Scanner;
import java.lang.Math;
public class Main {
    static int W;
    static int H;
    public static int[][] mp = new int[51][51];
    public static int countIsland(int h, int w){
        mp[h][w]=0;
        for(int i=-1;i<2;i++){
            for(int j = -1;j<2;j++){
                if(h+i>=H||h+i<0||w+j>=W||w+j<0||(i==0&&j==0)){
                    
                }
                else {
                    //System.out.printf("%d,%d%n",h+i,w+j);
                    if(mp[h+i][w+j]==1){
                        countIsland(h+i,w+j);
                    }
                }
                
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            for(int i=0;i<51;i++){
                for(int j=0;j<51;j++){
                    mp[i][j] = 0;
                }
            }
            W = sc.nextInt();
            H = sc.nextInt();
            if(W==0&&H==0) break;
            int cnt=0;
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    mp[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    if(mp[i][j]==1){
                        countIsland(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}

