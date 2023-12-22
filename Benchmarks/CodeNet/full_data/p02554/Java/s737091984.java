import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final long MOD = 1_000_000_007;
        
        long x10 = 1;
        long x9 = 1;
        long x8 = 1;
        
        for (int i = 0; i < N; i++) {
            x10 *= 10;
            x9 *= 9;
            x8 *= 8;
            
            x10 %= MOD;
            x9 %= MOD;
            x8 %= MOD;
        }
        long answer = x10 - x9 * 2 + x8;
        answer %= MOD;
        if (answer < 0) {
            answer += MOD;
        }
        System.out.println(answer);
    }
}
