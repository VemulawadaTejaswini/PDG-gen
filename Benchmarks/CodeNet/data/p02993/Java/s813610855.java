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
        String s =scan.next();
        char[] data = s.toCharArray();
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (data[i] == data[i+1]) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Bad" : "Good");
    }
}
