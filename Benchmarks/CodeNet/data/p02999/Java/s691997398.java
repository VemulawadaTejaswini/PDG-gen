import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int a = input.nextInt();

        if (x < a) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}
