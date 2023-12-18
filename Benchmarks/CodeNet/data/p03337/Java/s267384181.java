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
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            if (a + b > a - b) {
                if (a + b > a * b) {
                    System.out.println(a + b);
                } else {
                    System.out.println(a * b);
                }
            } else {
                if (a - b > a * b) {
                    System.out.println(a - b);
                } else {
                    System.out.println(a * b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
