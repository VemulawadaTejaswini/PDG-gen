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
        int N = scan.nextInt();
        String d = Integer.toString(N);
        char[] data = d.toCharArray();
        boolean answer = false;
        if (data[0] == data[1] && data[1] == data[2]) {
            answer = true;
        }
        if (data[1] == data[2] && data[2] == data[3]) {
            answer = true;
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
