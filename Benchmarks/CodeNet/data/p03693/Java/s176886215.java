import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int r = Integer.parseInt(strArr[0]);
            int g = Integer.parseInt(strArr[1]);
            int b = Integer.parseInt(strArr[2]);
            int num = r * 100 + g * 10 + b;
            if (num % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
