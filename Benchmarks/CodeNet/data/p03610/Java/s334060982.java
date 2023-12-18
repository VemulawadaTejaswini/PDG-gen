import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(str.charAt(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
