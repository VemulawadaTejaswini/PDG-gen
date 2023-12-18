import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        long ans = N;
        for (long i = 1; i <= N; i++) {
            for (long j = 1; j <= N; j++) {
                if ( N == i * j) {
                    if (ans > (i + j -2)) {
                        ans = i + j -2;
                    }
                }
            }
        }

        System.out.println(ans);
        s.close();
    }
    
}