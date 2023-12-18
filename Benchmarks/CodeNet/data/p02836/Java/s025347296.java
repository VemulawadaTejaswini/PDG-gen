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
        String s = scan.next();
        char[] data = s.toCharArray();
        int len = data.length;
        int answer = 0;
        for (int i = 0; i < len / 2; i++) {
            if (data[i] != data[len-i-1]) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
