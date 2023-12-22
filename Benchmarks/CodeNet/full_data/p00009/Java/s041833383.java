import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] memo = new int[999999];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i < 999999; i++) {
            memo[i] = -1;
        }
        BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
        do {
            String str = r.readLine();
            if (null == str) break;
            int num = Integer.parseInt(str);
            if (memo[num-1] < 0) {
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
                    memo[i-1] = count;
                }
                System.out.println(count);
            } else {
                System.out.println(memo[num-1]);
            }
        } while(true);
    }
}