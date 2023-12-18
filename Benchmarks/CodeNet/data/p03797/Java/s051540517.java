import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            long n = Long.parseLong(str[0]);
            long m = Long.parseLong(str[1]);
            long total = n;
            m = m - (n * 2);
            total = total + (m / 4);
            System.out.println(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}