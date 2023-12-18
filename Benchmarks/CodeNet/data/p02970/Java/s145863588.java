import java.util.Scanner;

public class Main {

   void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int tmp = N / (2*D + 1);
        int ans = 0;
        if (N % (2*D + 1) == 0) {
            ans = tmp;
        }
        else {
            ans = tmp + 1;
        }

        System.out.print(ans);

    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

