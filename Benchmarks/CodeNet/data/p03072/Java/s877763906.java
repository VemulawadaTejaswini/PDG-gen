import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int count = 1;
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int max = Integer.parseInt(tokenizer.nextToken());
        int value;
        for (int i = 1; i < n; i++) {
            value = Integer.parseInt(tokenizer.nextToken());
            if (value >= max)
                count++;

            max = Math.max(max, value);
        }
        System.out.println(count);
    }
}
