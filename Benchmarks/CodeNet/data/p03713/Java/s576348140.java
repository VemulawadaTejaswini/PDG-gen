import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long H = sc.nextLong();
        long W = sc.nextLong();
        sc.close();

        long Smax;
        long Smin;

        if(H%3 == 0 || W%3 == 0){
            System.out.println(0);
        } else {
            long same = Math.min(H, W); //同じ方向で分割した場合の最小値
            long cross1 = H*W; //縦横で分割した場合の最小値
            long cross2 = H*W;
            for(int i = 1; i <= H / 2; i++){
                long A = i * W;
                long B = (H-i) * (W/2);
                long C;
                if(W%2 == 0)
                    C = B;
                else
                    C = (H-i) * (W/2 + 1);
                Smax = Math.max(A, C);
                Smin = Math.min(A, B);
                cross1 = Math.min(cross1, Math.abs(Smax-Smin));
            }
            if(H==W){
                cross2 = cross1;
            } else {
                for(int i = 1; i <= W / 2; i++){
                    long A = i * H;
                    long B = (W-i) * (H/2);
                    long C;
                    if(H%2 == 0)
                        C = B;
                    else
                        C = (W-i) * (H/2 + 1);
                    Smax = Math.max(A, C);
                    Smin = Math.min(A, B);
                    cross2 = Math.min(cross2, Math.abs(Smax-Smin));
                }
            }
            System.out.println(Math.min(same, Math.min(cross1, cross2)));
        }


    }
}