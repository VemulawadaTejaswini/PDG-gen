import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        int N = Integer.parseInt(S[0]);
        long T = Integer.parseInt(S[1]);

        long[] TN = new long[N];
        for (int i = 0; i < N; i++) {
            TN[i] = Long.parseLong(sc.next());
        }

        long ans = T;
        for (int i = 0; i < N; i++) {
            if (i + 1 >= N) {
                break;
            }
            long next = TN[i + 1] - TN[i];
            ans += Math.min(T, next);
        }

        System.out.println(ans);
    }
}
