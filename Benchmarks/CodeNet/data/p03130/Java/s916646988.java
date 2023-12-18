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
        int[] path = new int[4];
        for (int i = 0; i < 3; i++) {
            path[scan.nextInt()-1] += 1;
            path[scan.nextInt()-1] += 1;
        }
        int[] count = new int[5];
        for (int i = 0; i < 4; i++) {
            count[path[i]] += 1;
        }
        if (count[1] == 2 && count[2] == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
