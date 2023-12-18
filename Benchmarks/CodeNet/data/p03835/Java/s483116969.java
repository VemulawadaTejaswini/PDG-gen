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
            int k = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);
            int count = 0;
            for (int x = 0; x <= s && x <= k; x++) {
                for (int y = 0; y <= s && y <= k; y++) {
                    for (int z = 0; z <= s && z <= k; z++) {
                        if (x + y + z == s) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}