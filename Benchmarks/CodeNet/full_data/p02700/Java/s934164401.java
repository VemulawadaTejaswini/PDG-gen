import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        int x = a % c;
        int y = d % b;

        System.out.println( (x > y) ? "Yes" : "No" );

    }
}
