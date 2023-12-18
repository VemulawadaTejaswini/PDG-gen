import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] oceros = S.toCharArray();
        int[] summary = new int[oceros.length+1];
        for (int i = 1; i <= oceros.length; i++) {
            if (oceros[i-1] == 'B') {
                summary[i] = summary[i - 1] + 1;
                continue;
            }
            summary[i] = summary[i - 1];
        }
        long ans = 0;
        for (int i = 1; i <= oceros.length; i++) {
            if (oceros[i-1] == 'W') {
                ans += summary[i];
            }
        }
        System.out.println(ans);
    }
}
