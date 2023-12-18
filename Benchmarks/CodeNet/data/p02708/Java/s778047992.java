import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long sum = 0;
        for(long i = K; i <= N+1; i++){
            long max = 0; 
            long min = 0;
            for(long j = 0; j < i; j++){
                max = max + N - j;
                min = min + j;
            }
            sum = sum + max - min + 1;
        }
        System.out.println(sum%(1000000000+7));
    }
} 