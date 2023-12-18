import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            long n = Long.parseLong(br.readLine());
            long total = 1;
            for (long i = 1; i <= n; i++) {
                total = (total * i) % (1000000000 + 7);
            }
            System.out.println(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}