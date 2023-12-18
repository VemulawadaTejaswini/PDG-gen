import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        if (!isKaibun(S)) {
            System.out.println("No");
            return;
        }

        char[] left = Arrays.copyOfRange(S, 0, (S.length - 1) / 2);
        if (!isKaibun(left)) {
            System.out.println("No");
            return;
        }
        char[] right = Arrays.copyOfRange(S, 0, (S.length - 1) / 2);
        if (!isKaibun(right)) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }

    private static boolean isKaibun(char[] chars) {
        for (int i = 0; i< (chars.length-1)/2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}