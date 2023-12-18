import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int K = scanner.nextInt();
        final int mod = 1000000007;
        int count = 0;
        for(int i = K; i<=N+1; i++){
            long min = (((long)i - 1) * (long)i) / 2;
            long max = ((long)(N + N-i+1) * (long)i) / 2;
            long num = max - min + 1;
            num = num % mod;
            count = (count + (int)(num))%mod;
        }
        System.out.println(count);
    }
}