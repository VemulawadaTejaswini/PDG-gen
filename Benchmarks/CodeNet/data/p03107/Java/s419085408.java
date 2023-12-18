import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solve(in.nextLine()));
    }
    public static int solve(String S) {
        if (S.length() <= 1) { return 0; }
        int i = S.indexOf("01");
        int j = S.indexOf("10");
        if (i == -1 && j == -1) {
            return 0;
        } else if (i == -1 && j > -1) {
            return solve(S.substring(0, j) + S.substring(j+2)) + 2;
        } else if (i > -1 && j == -1) {
            return solve(S.substring(0, i) + S.substring(i+2)) + 2;
        } else {
            return Math.max(
                solve(S.substring(0, i) + S.substring(i+2)) + 2,
                solve(S.substring(0, j) + S.substring(j+2)) + 2
            );
        }
    }
}
