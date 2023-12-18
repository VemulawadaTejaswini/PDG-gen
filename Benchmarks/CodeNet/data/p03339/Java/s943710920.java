import java.util.Arrays;
import java.util.List;
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

        List<String> list = Arrays.asList(s.split("(?<=(.))(?!\\1)"));
        String target = maxContinuity(list);
        int leaderIndex = s.indexOf(target);
        if (target.contains("E")) {
            leaderIndex += target.length() - 1;
        }
        return calc(s, leaderIndex);
    }

    private static String maxContinuity(List<String> list) {
        String maxString = "";
        int max = 0;
        for (String s : list) {
            if (max < s.length()) {
                max = s.length();
                maxString = s;
            }
        }
        return maxString;
    }

    private static int calc(String s, int index) {
        int indexT = index;
        String[] S = s.split("");
        int length = S.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if ((i < indexT && S[i].equals("W")) || (i > indexT && S[i].equals("E"))) {
                count++;
            }
        }
        return count;
    }
}
