import java.util.Scanner;

public class Main {
    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        String s = sc.next();
        System.out.println((s.contains("AC") ? "Yes": "No"));
    }
}
