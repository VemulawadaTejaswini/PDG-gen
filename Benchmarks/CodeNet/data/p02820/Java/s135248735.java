import java.util.Scanner;

public class Main {
    static int R;
    static int S;
    static int P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        R = sc.nextInt();
        S = sc.nextInt();
        P = sc.nextInt();
        String T = sc.next();
        char[] rsp = T.toCharArray();

        char[] out = new char[N];

        long ans = 0;
        for (int i = 0; i < K; i++) {
            out[i] = winHand(rsp[i]);
            ans += point(rsp[i]);
        }
        for (int i = K; i < N - K; i++) {
            char before = out[i - K];
            if (before != winHand(rsp[i])) {
                out[i] = winHand(rsp[i]);
                ans += point(rsp[i]);
                continue;
            }
            out[i] = loseHand(rsp[i + K]);
        }
        for (int i = N - K; i < N; i++) {
            char before = out[i - K];
            if (before != winHand(rsp[i])) {
                out[i] = winHand(rsp[i]);
                ans += point(rsp[i]);
                continue;
            }
        }

        System.out.println(ans);
    }

    private static char winHand(char hand) {
        if (hand == 'r') return 'p';
        if (hand == 's') return 'r';
        if (hand == 'p') return 's';
        return 'n';
    }

    private static char loseHand(char hand) {
        if (hand == 'r') return 's';
        if (hand == 's') return 'p';
        if (hand == 'p') return 'r';
        return 'n';
    }

    private static int point(char hand) {
        if (hand == 'r') return P;
        if (hand == 's') return R;
        if (hand == 'p') return S;
        return 0;
    }
}