import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;

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
            int M = sc.nextInt();
            int[] H = new int[N+1];

            for(int i=1; i<N+1; i++) {
                H[i] = sc.nextInt();
            }

            int[] A = new int[M+1];
            int[] B = new int[M+1];

            for(int i=1; i<M+1; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }

            int res = 0;
            for(int i=1; i<N+1; i++) {
                boolean isLoadExist = false;
                boolean isGoodLoad = false;
                for(int j=1; j<M+1; j++) {
                    if(i==A[j]||i==B[j]) {
                        if(i==A[j]) {
                            if(H[i]>H[B[j]]) {
                                isGoodLoad = true;
                            }
                        } else if(i==B[j]) {
                            if(H[i]>H[A[j]]) {
                                isGoodLoad = true;
                            }
                        }
                        isLoadExist = true;    
                    }
                }
                if(isGoodLoad) res++;
                if(!isLoadExist) res++;
            }

            System.out.println(res);

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
