import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");

        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[1]);
        int num3 = Integer.parseInt(temp[2]);
        int num4 = Integer.parseInt(temp[3]);

        if (num2 < num3) {
            System.out.println("0");
        } else {
            if (num1 < num3 && num2 > num4) {
                System.out.println(num4 - num3);
            } else {
                System.out.println(num2 - num3);
            }
        }
    }
}