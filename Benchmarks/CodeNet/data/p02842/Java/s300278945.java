import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        double n = Double.parseDouble(stdin.readLine());
        int a = (int) Math.ceil(n / 1.08);
        int b = (int) Math.floor((n + 1) / 1.08);

        if (a <= b) {
            stdout.println(a);
        } else {
            stdout.println(":(");
        }
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}
