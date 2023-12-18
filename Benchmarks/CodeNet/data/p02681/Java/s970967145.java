import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        String s1 = scanner.next();
        String s2 = scanner.next();


        System.out.println(s2.startsWith(s1) && s2.length() == s1.length() + 1 ? "Yes" : "No");

    }
}