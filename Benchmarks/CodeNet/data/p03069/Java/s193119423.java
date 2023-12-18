import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int firstBlack = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '#') {
                firstBlack = i + 1;
                break;
            }
        }

        int ansTurnBlack = 0;
        int ansTurnWhite = 0;
        int ans = 0;
        if (firstBlack != 0) {
            for (int i = firstBlack; i < N; i++) {
                if (S.charAt(i) == '.') {
                    ansTurnBlack += 1;
                }
            }
            for (int i = firstBlack; i < N; i++) {
                if (S.charAt(i) == '#') {
                    ansTurnWhite += 1;
                }
            }

            if (ansTurnWhite > ansTurnBlack) ans = ansTurnBlack;
            else ans = 1;
        }

        System.out.println(ans);
    }
}
