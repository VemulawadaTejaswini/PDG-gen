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
        int[] isDivisibleBy = new int[1000001];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int[] ar = new int[n];
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            if (!nums.containsKey(num)) {
                nums.put(num, 0);
            }
            nums.put(num, nums.get(num) + 1);
            ar[i] = num;
            isDivisibleBy[num]++;
        }



        int res = 0;
        for (int i : nums.keySet()) {
            if (nums.get(i) > 1) {
                continue;
            }
            boolean good = true;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    int div1 = j;
                    int div2 = i / j;
                    if (div1 != i && nums.containsKey(div1)) {
                        good = false;
                        break;
                    }
                    if (div2 != i && nums.containsKey(div2)) {
                        good = false;
                        break;
                    }
                }
            }
            if (good) res++;
        }

        System.out.println(res);
    }
}
