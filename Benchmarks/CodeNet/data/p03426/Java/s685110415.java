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
        int Q = sc.nextInt();
        for(int i=1;i<=Q;i++){
            long ans = 0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            while(L<R){
                ans += Math.abs(dic[L][0]-dic[L+D][0])+Math.abs(dic[L][1]-dic[L+D][1]);
                L += D;
            }
            System.out.println(ans);
        }



    }
}