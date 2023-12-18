import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int n = sc.nextInt();
        System.out.println(n / 3);
    }
}