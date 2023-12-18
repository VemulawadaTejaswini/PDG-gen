import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        int a4 = scan.nextInt();
        boolean[] digits = new boolean[10];
        digits[a1] = true;
        digits[a2] = true;
        digits[a3] = true;
        digits[a4] = true;
        if (digits[1]&&digits[4]&&digits[7]&&digits[9]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
