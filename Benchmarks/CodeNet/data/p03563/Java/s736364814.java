import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int R = sc.nextInt();
        int G = sc.nextInt();
        System.out.println(G + -(R - G));
    }
}
