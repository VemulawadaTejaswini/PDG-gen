import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
        do {
            String str = r.readLine();
            if (null == str) break;
            int num = Integer.parseInt(str);
            if (num < 2) {
                System.out.println(0);
                continue;
            } else if (num == 2) {
                System.out.println(1);
                continue;
            }
            int count = 2;
            boolean isPrime = false;
            for (int i = 3; i <= num; i += 2) {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    isPrime = true;
                }
                if (isPrime) count++;
            }
            System.out.println(count);
        } while(true);
    }
}