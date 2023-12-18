import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        int A1;
        int A2;
        if (S%2 == 1) {
            A1 = S/2;
            A2 = S/2+1;
        } else {
            A1 = S/2;
            A2 = S/2;
        }

        StringBuilder ans = new StringBuilder();
        if (N == K) {
            ans.append(S).append(" ");
        } else if (K == 0) {
            ans.append(S+1).append(" ");
        } else {
            for (int i = 0; i < K+1; i++) {
                if (i%2 == 0) {
                    ans.append(A1).append(" ");
                } else {
                    ans.append(A2).append(" ");
                }
            }
            for (int i = K+1; i < N; i++) {
                ans.append(S+1).append(" ");
            }
        }


        System.out.println(ans.toString());
    }
}
