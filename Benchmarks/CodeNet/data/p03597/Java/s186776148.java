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
        int N = sc.nextInt();
        int A = sc.nextInt();
        
        int m = N * N;
        System.out.println(m - A);
    }

}