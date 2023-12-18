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
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int d = Integer.parseInt(str[3]);
            if (a + b > c + d) {
                System.out.println("Left");
            } else if (a + b < c + d) {
                System.out.println("Right");
            } else {
                System.out.println("Balanced");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
