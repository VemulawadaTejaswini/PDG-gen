import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(solve(s.nextLine()));

    }

    public static int solve(String s) {

        int n = s.length();

        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i += 2) {

            if (s.charAt(i) == '0') {
                a++;
            } else {
                b++;
            }
        }

        for (int i = 1; i < n; i += 2) {

            if (s.charAt(i) == '1') {
                a++;
            } else {
                b++;
            }
        }

        return Math.min(a, b);

    }
}