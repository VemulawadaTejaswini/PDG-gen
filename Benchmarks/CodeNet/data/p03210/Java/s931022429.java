import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main implements Runnable {

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        int age = 0;
        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            age = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 出力
        String result = "NO";
        switch(age) {
            case 7:
            case 5:
            case 3:
                result = "YES";
                break;
        }
        System.out.println(result);
    }
}
