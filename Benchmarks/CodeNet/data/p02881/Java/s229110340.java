import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N  = sc.nextLong();
        double limit = Math.sqrt(N);
        long min = N;
        long ans = 10^16;
        for(int i = 1; i < limit; i++){
            if(N % i != 0) continue;
            long j = N/i;
            min = Math.min(ans, i + j -2);
        }
        System.out.println(min);
    }
}