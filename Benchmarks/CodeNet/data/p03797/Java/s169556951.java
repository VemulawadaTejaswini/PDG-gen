import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        long n = Long.parseLong(tokenizer.nextToken());
        long m = Long.parseLong(tokenizer.nextToken());
        long countFirst = m /2;
        long count  = Math.min(n, countFirst);
        m -= count * 2;
        count += m / 4;
        System.out.println(count);
    }
}
