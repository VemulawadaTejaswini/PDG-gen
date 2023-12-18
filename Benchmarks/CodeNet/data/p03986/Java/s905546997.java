import java.util.Scanner;
import java.lang.Math;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int ans = str.length();

        int sequenceS = 0, sequenceT = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'S') {
                ans -= (i > 0 && str.charAt(i - 1) == 'T') ? 2 * Integer.min(sequenceS, sequenceT) : 0;
                sequenceS = (i > 0 && str.charAt(i - 1) == 'T') ? 1 : sequenceS + 1;
            } else {
                sequenceT = (i > 0 && str.charAt(i - 1) == 'S') ? 1 : sequenceT + 1;
                ans -= (i == str.length() - 1) ? 2 * Integer.min(sequenceS, sequenceT) : 0;
            }
        }

        System.out.println(ans);

    }
}