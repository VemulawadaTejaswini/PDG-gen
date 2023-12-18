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
        long answer = 0;
        for (int i = A; i <= B; i++) {
            String s = Integer.toString(i);
            char[] d = s.toCharArray();
            if (kaibun(d)) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
    public boolean kaibun(char[] d) {
        int length = d.length;
        for (int i = 0; i < length / 2; i++) {
            if (d[i] != d[length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
