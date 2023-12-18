
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        if (S.length < 3 || S.length > 99) {
            System.out.println("No");
            return;
        }
        if (!isKaibun(S)) {
            System.out.println("No");
            return;
        }

        char[] left = Arrays.copyOfRange(S, 0, (S.length - 1) / 2);
        if (!isKaibun(left)) {
            System.out.println("No");
            return;
        }
        char[] right = Arrays.copyOfRange(S, (S.length + 3) / 2 - 1, S.length);
        if (!isKaibun(right)) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }

    private static boolean isKaibun(char[] chars) {
        if (chars.length == 1) {
            return true;
        }
        if (chars.length < 3) {
            return false;
        }
        for (int i = 0; i< (chars.length-1)/2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
