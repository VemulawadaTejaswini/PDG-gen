import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("2018" + s.substring(4));
    }
}
