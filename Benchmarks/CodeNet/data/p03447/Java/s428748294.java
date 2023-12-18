import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((X - A) - (X - A) / B * B);
    }
}
