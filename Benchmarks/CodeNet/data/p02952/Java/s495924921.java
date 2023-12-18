import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if ((1 <= i && i <= 9) || (100 <= i && i <= 999) || (10000 <= i && i <= 99999)) {
                count++;
            }
        }
        System.out.print(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

