import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] d = new int[3];
        d[0] = scan.nextInt();
        d[1] = scan.nextInt();
        d[2] = scan.nextInt();
        Arrays.sort(d);
        if (d[0] + d[1] == d[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
