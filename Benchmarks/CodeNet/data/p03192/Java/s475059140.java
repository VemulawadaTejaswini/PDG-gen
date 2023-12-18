import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main implements Runnable {
    // 定数

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        int result = 0;
        String N = "";

        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            N = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (char c : N.toCharArray()) {
            if (c == '2') {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
