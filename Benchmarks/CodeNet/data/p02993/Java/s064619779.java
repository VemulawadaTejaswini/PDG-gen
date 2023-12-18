import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();

        char prev = S[0];
        for (int i = 1; i < S.length; i++) {
            if (prev == S[i]) {
                System.out.println("Bad");
                return;
            }

            prev = S[i];
        }

        System.out.println("Good");
    }

}
