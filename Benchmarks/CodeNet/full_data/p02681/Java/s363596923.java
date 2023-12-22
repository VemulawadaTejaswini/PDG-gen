import java.util.Scanner;

public class Main {

    private static boolean canBeAppended(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        int m = s1.length(), n = s2.length(), i = 0;
        while (i < m && i < n) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
            i++;
        }

        return n != i && n - i <= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(canBeAppended(s1, s2) ? "Yes" : "No");
        sc.close();
    }
}