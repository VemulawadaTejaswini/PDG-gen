import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = sc.nextInt();
            String S = sc.next();

            int[] gList = new int[N];
            int gListIndex = 0;

            int cnt = 0;
            
            for(int a=0; a<S.length(); a++) {
                if('G'==S.charAt(a)) {
                    gList[gListIndex] = a;
                    gListIndex++;
                }
            }

            for(int x=0; x<gListIndex; x++) {
                int j = gList[x];
                for(int i=0; i<j; i++) {
                    if('R'==S.charAt(i)) {
                        for(int k=j+1; k<S.length(); k++) {
                            if('B'==S.charAt(k)&&(j-i)!=(k-j)) cnt++;
                        }
                    }
                }
            }

            System.out.println(cnt);
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