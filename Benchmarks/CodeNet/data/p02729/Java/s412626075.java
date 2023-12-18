import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int even = Integer.parseInt(lines[0]);
        int odd = Integer.parseInt(lines[1]);
        int total = even + odd;
        out.println(total * (total - 1) - even * odd);
        out.flush();
        out.close();
        br.close();
    }
}