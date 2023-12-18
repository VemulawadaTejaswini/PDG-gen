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
            long total = 0;
            while (true) {
                if (n > 0) {
                    if (m >= 2) {
                        total++;
                        n--;
                        m = m - 2;
                    } else {
                        break;
                    }
                } else {
                    if (m >= 4) {
                        total++;
                        m = m - 4;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}