import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        scanner.close();

        System.out.println(resolve(n, s));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int resolve(int n, String s) {

        String[] S = s.split("(?<=(.))(?!\\1)");
        int targetIndex = maxContinuity(S);
        return calc(S, targetIndex);
    }

    private static int maxContinuity(String[] S) {
        int maxIndexE = 0;
        int maxIndexW = 0;
        int countE = 0;
        int countW = 0;
        int size = S.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            int sSize = S[i].length();
            if (max < sSize) {
                max = sSize;
                if (S[i].contains("E")) {
                    maxIndexE = i;
                    countE++;
                } else {
                    maxIndexW = i;
                    countW++;
                }
            }
        }
        return (countE >= countW) ? maxIndexE : maxIndexW;
    }

    private static int calc(String[] S, int index) {
        int length = S.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if ((i < index && S[i].contains("W")) || (i > index && S[i].contains("E"))) {
                count += S[i].length();
            }
        }
        return count;
    }
}