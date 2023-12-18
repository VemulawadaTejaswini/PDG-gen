import java.util.*;
public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        int[] digits = new int[4];

        boolean nonDigit = false;
        for (int i = 0; i < 4; i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                digits[i] = Character.digit(S.charAt(i), 10);
            } else {
                nonDigit = true;
                break;
            }
        }

        if (nonDigit) {
            System.out.println("NA");
        } else {
            boolean canYYMM = isYY(digits[0], digits[1]) && isMM(digits[2], digits[3]);
            boolean canMMYY = isMM(digits[0], digits[1]) && isYY(digits[2], digits[3]);

            if (canYYMM && canMMYY) {
                System.out.println("AMBIGUOUS");
                return;
            }
            if (canYYMM) {
                System.out.println("YYMM");
                return;
            }
            if (canMMYY) {
                System.out.println("MMYY");
                return;
            }
            System.out.println("NA");
        }
    }

    private static boolean isYY(int d1, int d2) {
        return 0 <= d1 && d1 <= 9 && 0 <= d2 && d2 <= 9;
    }
    private static boolean isMM(int d1, int d2) {
        if (d1 == 0) {
            return 1 <= d2 && d2 <= 9;
        } else if (d1 == 1) {
            return 0 <= d2 && d2 <= 2;
        } else {
            return false;
        }
    }
}
