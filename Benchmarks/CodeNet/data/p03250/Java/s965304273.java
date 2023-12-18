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
        int answer = d[2] * 10 + (d[1] + d[0]);
        System.out.println(answer);
    }
}
