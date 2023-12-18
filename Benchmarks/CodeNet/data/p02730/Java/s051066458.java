
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();
        int N = S.length;

        int half = (N - 1) / 2;
        int quat = half / 2;

        // N = 11 half = (11 - 1)/2 = 5 quat = 5 / 2 = 2.5 = 2
        // N = 13 half = (13 - 1)/2 = 6 quat = 6 / 2 = 3

        for (int i = 0 ; i < half ; i++) {
            if (S[i] != S[N - 1 - i]) {
                System.out.println("No");
                return;
            }
        }

        // 0 1 2 3 4 5 6 7 8 9 10
        // 0-4 6-10
        // 1-3 7-9

        for (int i = 0 ; i < quat ; i++) {
            if (S[i] != S[half - 1 - i] || S[half + 1 + i] != S[N - 1 - i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

        // akasaka Yes
        // level No
        //
    }
}
