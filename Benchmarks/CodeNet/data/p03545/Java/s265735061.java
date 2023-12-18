import java.util.Scanner;

public class Main {

    static String[] OPR = { "+", "-" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ABCD = sc.nextLine();

        String ans = solve(ABCD);
        System.out.println(ans);
    }

    private static String solve(String aBCD) {
        char[] abcd = aBCD.toCharArray();
        int a = Integer.parseInt(String.valueOf(aBCD.charAt(0)));
        int b = Integer.parseInt(String.valueOf(aBCD.charAt(1)));
        int c = Integer.parseInt(String.valueOf(aBCD.charAt(2)));
        int d = Integer.parseInt(String.valueOf(aBCD.charAt(3)));

        for (int i = 0; i < OPR.length; i++) {
            for (int j = 0; j < OPR.length; j++) {
                for (int k = 0; k < OPR.length; k++) {
                    int tmp = sum(OPR[i], a, b);
                    tmp = sum(OPR[j], tmp, c);
                    tmp = sum(OPR[k], tmp, d);
                    if (tmp == 7) {
                        return makeFormula(i, j, k, a, b, c, d);
                    }
                }
            }
        }
        return null;
    }

    private static String makeFormula(int i, int j, int k, int a, int b, int c, int d) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(OPR[i]);
        sb.append(b);
        sb.append(OPR[j]);
        sb.append(c);
        sb.append(OPR[k]);
        sb.append(d);
        sb.append("=7");
        return sb.toString();
    }

    private static int sum(String term, int v1, int v2) {
        if (term.equals("+")) {
            return v1 + v2;
        } else {
            return v1 - v2;
        }
    }
}
