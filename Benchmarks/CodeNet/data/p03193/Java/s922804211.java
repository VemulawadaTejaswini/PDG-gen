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
        int N = 0;
        int H = 0;
        int W = 0;
        int A = 0;
        int B = 0;

        int result = 0;

        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String[] line = br.readLine().split(" ");
            N = Integer.parseInt(line[0]);
            H = Integer.parseInt(line[1]);
            W = Integer.parseInt(line[2]);

            for (int i = 0; i < N; i++) {
                line = br.readLine().split(" ");
                A = Integer.parseInt(line[0]);
                B = Integer.parseInt(line[1]);

                if (A >= H && B >= W) {
                    result++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 出力
        System.out.println(result);
    }
}
