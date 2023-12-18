import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    int n;
    int[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            dp[lower_bound(dp, as[i])] = as[i];
        }
        int length = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] < Integer.MAX_VALUE) {
                length = i;
            }
        }
        System.out.println(n - length);
        /*
        int count = 0;
        if (n % 2 == 0) {
            int half = n / 2;
            for (int i = 0; i < n; i++) {
                if (i < half && as[i] > half) {
                    count++;
                } else if (i >= half && as[i] <= half) {
                    count++;
                }
            }
        } else if (n % 2 == 1) {
            int half = (n + 1) / 2;
            for (int i = 0; i < n / 2; i++) {
                if (as[i] > half) {
                    count++;
                }
            }
            for (int i = half; i < n; i++) {
                if (as[i] < half) {
                    count++;
                }
            }
        }
        System.out.println(count);
        */
        /*
        int maxCount = 0;
        int minCount = 0;
        int max = n;
        int min = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (as[i] == max) {
                maxCount++;
                max--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (as[i] == min) {
                minCount++;
                min++;
            }
        }
        System.out.println(n - Math.max(maxCount, minCount));
        */
    }

    static int lower_bound(int[] arr, int key) {
        return lower_bound(arr, 0, arr.length - 1, key);
    }

    static int lower_bound(int[] arr, int beginIndex, int endIndex, int key) {
        int low = beginIndex;
        int high = endIndex;
        while (high - low >= 0) {
            int mid = (low + high) / 2;
            if (key <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
