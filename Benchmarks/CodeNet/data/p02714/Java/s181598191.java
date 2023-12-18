import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        int ans = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    if (check(a, b, c, s)) ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int a, int b, int c, String s) {
        if (c - b == b - a) return false;
        if (s.charAt(a) != s.charAt(b) && s.charAt(a) != s.charAt(c) && s.charAt(b) != s.charAt(c)) {
            return true;
        } else {
            return false;
        }
    }
}