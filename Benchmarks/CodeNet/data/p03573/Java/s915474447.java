import java.util.Scanner;

public class Main {


    int a, b, c;
    public void solve() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b) System.out.println(c);
        if (a == c) System.out.println(b);
        if (b == c) System.out.println(a);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}