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
        int D = scan.nextInt();
        StringBuilder answer = new StringBuilder("Chiristmas");
        if (D < 25) {
            for (int i = D; i < 25; i++) {
                answer.append(" Eve");
            }
        }
        System.out.println(answer.toString());
    }
}
