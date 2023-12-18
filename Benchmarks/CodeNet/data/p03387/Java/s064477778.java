import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int[] input = new int[3];
            for(int i = 0; i < input.length; i++) input[i] = sc.nextInt();

            Arrays.sort(input);
            int answer = 0;
            int max_mod = input[2] % 2;
            if(input[0] % 2 == max_mod && input[1] % 2 == max_mod) {
                // Nothing to do
            } else if(input[0] % 2 != max_mod && input[1] % 2 != max_mod) {
                answer++;
            } else {
                answer += 2;
                //System.out.println("mod");
            }

            int max = input[2];
            for(int i = 0 ; i < 2; i++) {
                //System.out.println((max - input[i]) / 2);
                answer += (max - input[i]) / 2;
            }
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}
