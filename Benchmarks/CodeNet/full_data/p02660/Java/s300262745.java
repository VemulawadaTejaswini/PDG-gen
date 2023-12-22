import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;

public class Main{
    public static void main(final String[] args){

        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        long q = 2;
        int e = 1;
        long div;
        int loops = 43;

        //1だった時はさっさと終わらす
        if(N == 1){
            System.out.println(0);
            return;
        }

        for(int i = 1; i < loops; i++){
            div = Math.pow(q, i);
            if(N % div == 0){
                ans++;
                N = (long) (N / div);
            }else{
                while(N % q == 0){
                    N /= q;
                }
                q++;
                i = 1;
                break;
            }
        }
        if(N != 1){
            ans++;
        }

        System.out.println(ans);
    }
}
