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
        int D = 0;
        
        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            D = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = "";
        switch (D) {
            case 25:
            result = "Christmas";
            break;
            case 24:
            result = "Christmas Eve";
            break;
            case 23:
            result = "Christmas Eve Eve";
            break;
            case 22:
            result = "Christmas Eve Eve Eve";
            break;
        }

        // 出力
        System.out.println(result);
    }
}
