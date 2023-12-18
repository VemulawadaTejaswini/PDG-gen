import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();    
        int K = stdIn.nextInt();    
        stdIn.close();
        long mod = (long)(Math.pow(10, 9) + 7);
        long cnt = 0;

        for (int i = K; i <= N + 1; i++) {
            long l = sum(0, i - 1);
            long r = sum(N - i + 1, N);
            cnt += r - l + 1;
        }
        System.out.println(cnt % mod);        
    }

    public static long sum (long l, long r) {
        return (l + r) * (r - l + 1) / 2;
    }
}