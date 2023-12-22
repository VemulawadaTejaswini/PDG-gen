import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String cache = null;
        String[] str = sc.next().split("");

        for (int i = 0; i < str.length; i++) {
            if ("?".equals(str[i])) {
                System.out.print("D");
                cache = "D";
            } else {
                System.out.print(str[i]);
                cache = str[i];
            }
        }
    }
}
