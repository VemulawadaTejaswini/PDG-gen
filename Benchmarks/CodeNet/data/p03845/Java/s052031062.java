import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] T = new int[N];
        for (int i=0; i<N; i++) {
            T[i] = scan.nextInt();
        }

        int M = scan.nextInt();
        int P, X, ans;
        for (int i=0; i<M; i++) {
            P = scan.nextInt();
            X = scan.nextInt();

            ans = 0;
            for (int j=0; j<N; j++) {
                if (j+1 == P) {
                    ans += X;
                } else {
                    ans += T[j];
                }
            }

            System.out.println(ans);
        }
    }
}
