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
        System.out.println(pridict(s));
    }
    private String pridict(String s) {
        if ("Sunny".equals(s)) {
            return "Cloudy";
        }
        if ("Cloudy".equals(s)) {
            return "Rainy";
        }
        return "Sunny";
    }
}
