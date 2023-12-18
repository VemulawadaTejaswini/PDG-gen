import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        sc.close();
        if (K == 1) {
            System.out.println(S.substring(K-1, K).toLowerCase() + S.substring(K));
        } else if (K == N) {
            System.out.println(S.substring(0, K-1) + S.substring(K-1, K).toLowerCase());
        } else {
            System.out.println(S.substring(0, K-1) + S.substring(K-1, K).toLowerCase() + S.substring(K, N));
        }
    }
}
