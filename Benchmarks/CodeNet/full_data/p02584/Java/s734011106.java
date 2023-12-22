import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();

        long ans =0;
        if(Math.abs(X)> K*D){
            if(X>0){
                ans = X-K*D;
            }else{
                ans = X+K*D;
            }
        }else{
            if(X>0){
                long t = Math.min(X/D,K);
                K -= t;
                X -= t*D;
                if(K%2==0){
                    ans= X;
                }else{
                    ans =X-D;
                }
            }else{
                long t = Math.min(Math.abs(X)/D,K);
                K -= t;
                X += t*D;
                if(K%2==0){
                    ans = X;
                }else{
                    ans =X+D;
                }
            }
        }

        System.out.println(Math.abs(ans));

    }
}