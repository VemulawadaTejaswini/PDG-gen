import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int allW = 0;
        boolean firstWhiteFlag = false;
        for (int n = N - 1; n >= 0; n -= 1) {
            char s = S.charAt(n);
            if (s == '.') {
                firstWhiteFlag = true;
            }
            if (firstWhiteFlag && s == '#') {
                allW += 1;
            }
        }

        int allB = 0;
        boolean firstBrackFlag = false;
        for (char s : S.toCharArray()) {
            if (s == '#') {
                firstBrackFlag = true;
            }
            if (firstBrackFlag && s == '.') {
                allB += 1;
            }
        }

        if (allW < allB) {
            System.out.println(allW);
        } else {
            System.out.println(allB);
        }
    }
}
