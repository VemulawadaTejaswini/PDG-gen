import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sq = (long)Math.sqrt(N);
        long ans = Long.MAX_VALUE;
        for(long i=1;i<sq;i++){
            if(N==(N/i)*i){
                ans = Math.min(ans, N/i+i);
            }
        }
        System.out.println(ans-2);
    }
}
