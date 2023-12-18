import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S));
    }

    private static String solve(String S) {
        boolean yymm = false;
        boolean mmyy = false;

        int pre = Integer.parseInt(S.substring(0, 2));
        if (pre > 0 && pre <= 12) mmyy = true;

        int post = Integer.parseInt(S.substring(2, 4));
        if (post > 0 && post <= 12) yymm = true;


        if (yymm && mmyy) {
            return "AMBIGUOUS";
        } else if (yymm && !mmyy) {
            return "YYMM";
        } else if (!yymm && mmyy) {
            return "MMYY";
        } else {
            return "NA";
        }
    }
}
