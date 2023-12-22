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
        int turn = 0;
        while (0 < A && 0 < C) {
            if (turn == 0) {
                C -= B;
                turn = 1;
            } else {
                A -= D;
                turn = 0;
            }
        }
        if (A <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
