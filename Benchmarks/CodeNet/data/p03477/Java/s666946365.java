import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int L = A + B;
        int R = C + D;
        if (L == R) {
            System.out.println("Balanced");
        } else if (L > R) {
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }
    }
}
