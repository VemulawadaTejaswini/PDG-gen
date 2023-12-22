import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;

public class Main{
    public static void main(final String[] args){

        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        int value = 0;

        int[] accum = new int[43];
        accum[0] = 0;
        for (int i=1; i<42; i++){
            accum[i+1] = i + accum[i];
        }

        int div = 2;
        int count = 0;
        while(N % div == 0){
            N /= div;
            count ++;
            }
        }
        // 2が何個あったかで処理。
        for(int i = 0; i < size; i++){
            value = accum.get(i);
            if(count < value){
                ans += i;
                break;
            }
        }

        div = 3;
        count = 0;
        while(div * div <= N){
            if(N % div == 0){
                N /= div;
                count ++;
            }else{
                // その素数が何個あったかで処理。
                for(int i = 0; i < size; i++){
                    value = accum.get(i);
                    if(count < value){
                        ans += i;
                        break;
                    }
                }
                div += 2;
                count = 0;
            }
        }
        if(N != 1){
            ans ++;
        }

        System.out.println(ans);
    }
}