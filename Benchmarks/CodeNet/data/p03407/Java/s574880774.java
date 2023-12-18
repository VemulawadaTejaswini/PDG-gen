import java.util.Scanner;

public class Main{

    int a, b;
    int cost;

    public void solve() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        cost = sc.nextInt();

        if (a + b <= cost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
