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
            long a = Long.parseLong(strArr[0]);
            long b = Long.parseLong(strArr[1]);
            if (a <= 0) {
                if (b >= 0) {
                    System.out.println("Zero");
                } else {
                    long temp = b - a;
                    if (temp % 2 == 0) {
                        System.out.println("Negative");
                    } else {
                        System.out.println("Positive");
                    }
                }
            } else {
                System.out.println("Positive");
            }
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
