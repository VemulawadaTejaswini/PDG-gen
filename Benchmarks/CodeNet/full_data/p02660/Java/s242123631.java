import java.util.*;
import java.math.*;

public class Main{
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        long q = 2;
        int e = 1;
        long div;

        if(N == 1){
            System.out.println(0);
            return;
        }

        while(q * q <= N + 100){
            div = (long) Math.pow(q, e);
            if(N % div == 0){
                N /= div;
                ans++;
                e++;
            }else{
                while(N % q == 0){
                    N /= q;
                }
                q++;
                e = 1;
            }
        }

        if(N != 1){
            ans++;
        }

        System.out.println(ans);
    }
}
