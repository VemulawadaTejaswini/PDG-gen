import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (B < A) {
            int T = A;
            A = B;
            B = T;
        }
        if ((B-A) % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(A + (B-A)/2);
        }
    }
}
