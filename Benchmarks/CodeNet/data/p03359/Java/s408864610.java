import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int answer = a - 1;
        if (a <= b) {
            answer += 1;
        }
        System.out.println(answer);
    }

}