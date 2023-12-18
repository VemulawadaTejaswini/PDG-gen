import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long N = 0;
        int ans =(int)1e9;
        N = scanner.nextInt();
        int A, B;
        for(A = 1; A <= N; A++){
            for(B = 1; B <= Math.sqrt(N); B++){
                if(N == A * B) {
                    ans = Math.min( ans, String.valueOf(Math.max(A,B)).length() );
                }
            }
        }
        System.out.println(ans);
    }
}