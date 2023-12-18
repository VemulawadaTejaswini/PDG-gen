import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] d = new long[6];
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char c = s.toCharArray()[0];
            int index = index(c);
            d[index] += 1;
        }
        long answer = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = i+1; j <= 5; j++) {
                for (int k = j+1; k <= 5; k++) {
                    answer += d[i]*d[j]*d[k];
                }
            }
        }
        System.out.println(answer);
    }

    public int index(char c) {
        if (c == 'M') {
            return 1;
        }
        if (c == 'A') {
            return 2;
        }
        if (c == 'R') {
            return 3;
        }
        if (c == 'C') {
            return 4;
        }
        if (c == 'H') {
            return 5;
        }
        return 0;
    }
}
