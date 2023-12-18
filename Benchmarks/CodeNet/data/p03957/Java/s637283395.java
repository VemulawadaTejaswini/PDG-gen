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
        String S = scan.next();
        char[] d = S.toCharArray();
        int minC = Integer.MAX_VALUE;
        int maxF = Integer.MIN_VALUE;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'C') {
                minC = i;
                break;
            }
        }
        for (int i = d.length-1; 0 <= i; i--) {
            if (d[i] == 'F') {
                maxF = i;
                break;
            }
        }
        if (minC < maxF) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
