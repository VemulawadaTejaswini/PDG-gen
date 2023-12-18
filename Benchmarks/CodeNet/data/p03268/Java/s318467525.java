import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        long ans = 0;
        long num = n / k;
        ans = num * num * num;
        if (k % 2 == 0) {
            num = n / (k / 2) - num;
            ans += num * num * num;
        }

        System.out.println(ans);
    }
}
