import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long N = in.nextLong(), ans = Long.MAX_VALUE;
        for(long i = 1; i*i <= N; i++){
            if(N % i == 0){
                long j = N/i;
                ans = Math.min(ans, i-1+j-1);
            }
        }
        System.out.println(ans);
    }
}