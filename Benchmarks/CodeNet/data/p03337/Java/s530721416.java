import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        solve();
    }

    static void solve() {
        int add = A + B;
        int sub = A - B;
        int mul = A * B;

        int max = Math.max(Math.max(add, sub), mul);
        System.out.println(max);
    }
}
