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
        int[] d = new int[10];
        d[scan.nextInt()] += 1;
        d[scan.nextInt()] += 1;
        d[scan.nextInt()] += 1;
        for (int i = 1; i < 10; i++) {
            if (d[i] == 2) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
