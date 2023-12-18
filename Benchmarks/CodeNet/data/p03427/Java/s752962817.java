import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        String n = sc.next();

        int ans = n.charAt(0) - '1';
        ans += 9 * (n.length() - 1);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
