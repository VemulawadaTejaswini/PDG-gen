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
            long x = Long.parseLong(strArr[0]);
            long y = Long.parseLong(strArr[1]);
            if (x >= 0) {
                if (y >= 0) {
                    System.out.println(y - x);
                } else {
                    long diff = (-1 * y) - x;
                    System.out.println(diff + 1);
                }
            } else {
                if (y >= 0) {
                    long diff = y - (-1 * x);
                    System.out.println(diff + 1);
                } else {
                    long diff = (-1 * y) - (-1 * x);
                    System.out.println(diff + 2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
