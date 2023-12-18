
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = scanner.nextInt();
        int S = scanner.nextInt();
        int P = scanner.nextInt();
        String T = scanner.next();
        String ANS = "";
        Character c = null;

        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (0 <= i - K) {
                c = ANS.charAt(i - K);
            }
            char cc = T.charAt(i);
            if (cc == 'r') {
                if (c != null && c == 'P') {
                    ANS += "X";
                } else {
                    ANS += "P";
                    ans += P;
                }

            } else if (cc == 's') {
                if (c != null && c == 'R') {
                    ANS += "X";
                } else {
                    ANS += "R";
                    ans += R;
                }
            } else if (cc == 'p') {
                if (c != null && c == 'S') {
                    ANS += "X";
                } else {
                    ANS += "S";
                    ans += S;
                }
            }
        }
//        System.out.println(ANS);
        System.out.println(ans);
    }
}