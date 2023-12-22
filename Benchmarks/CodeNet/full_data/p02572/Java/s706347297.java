import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final long MODULO =  (long)1e9 + 7;
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int N = fastReader.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = fastReader.nextInt();
        }
        int j = nums.length - 1;
        while(j >= 0 && nums[j] == 0) j--;
        if(j <= 0) {
            System.out.println(0);
            return;
        }
        long sum = nums[j];
        long res = 0;
        for(int i = j - 1; i >= 0; i--) {
            if(nums[i] == 0) {
                continue;
            }

            res = (res + sum*nums[i] % MODULO) % MODULO;
            sum = (sum + nums[i]) % MODULO;
        }

        System.out.println(res);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
