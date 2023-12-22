import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(f.readLine());
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            sum += num;
            if (!nums.containsKey(num)) {
                nums.put(num, 0);
            }
            nums.put(num, nums.get(num) + 1);
        }

        int q = Integer.parseInt(f.readLine());
        for (int q1 = 0; q1 < q; q1++) {
            tokenizer = new StringTokenizer(f.readLine());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            Integer numOf = nums.get(b);
            if (numOf == null) numOf = 0;
            sum += (long) numOf * c;
            sum -= (long) numOf * b;
            nums.put(b, 0);
            if (!nums.containsKey(c)) {
                nums.put(c, 0);
            }
            nums.put(c, nums.get(c) + numOf);

            out.println(sum);
        }


        out.close();
    }
}
