import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int c = S.length() - 2;
        int ans = Math.abs(753 - Integer.parseInt(S.substring(0, 3)));

        for (int i = 1; i < c; i++) {
            int n = Integer.parseInt(S.substring(i, i + 3));
            int abs = Math.abs(753 - n);
            if (abs < ans) {
                ans = abs;
            }
        }
        System.out.println(ans);
    }
}