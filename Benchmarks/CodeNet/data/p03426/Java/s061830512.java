import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int[][] dic = new int[H*W+1][2]; // first is #row, second is #col
        for(int row=1;row<=H;row++){
            for(int col=1;col<=W;col++){
                int cur = sc.nextInt();
                dic[cur][0] = row;
                dic[cur][1] = col;
            }
        }
        int[][] result = new int[H*W+1][H*W/D+10];
        for(int i=1;i<=H*W-D;i++){
            int j=1;
            int ans = 0;
            while(i+j*D<=H*W) {
                ans += Math.abs(dic[i+(j-1)*D][0]-dic[i+j*D][0]) + Math.abs(dic[i+(j-1)*D][1]-dic[i+j*D][1]);
                result[i][j] = ans;
                j++;
            }
        }
        int Q = sc.nextInt();
        for(int i=1;i<=Q;i++){
            long ans = 0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            int len = (R-L)/D;
            ans = result[L][len];
            System.out.println(ans);
        }



    }
}