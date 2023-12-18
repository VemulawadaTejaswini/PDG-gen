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
            int[] t = new int[N];
            int[] x = new int[N];
            int[] y = new int[N];

            for(int i=0; i<N; i++) {
                t[i] = sc.nextInt();
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }

            String res = "No";
            boolean isJudgeEnd = false;

            int a = 0;
            while(!isJudgeEnd) {
                if(a!=0) {
                    int distance = 0;
                    if(x[a]-x[a-1]>0) {
                        if(y[a]-y[a-1]>0) {
                            distance = (x[a]-x[a-1])+(y[a]-x[a-1]);
                        } else {
                            distance = (x[a]-x[a-1])+(y[a-1]-x[a]);
                        }
                    } else {
                        if(y[a]-y[a-1]>0) {
                            distance = (x[a-1]-x[a])+(y[a]-x[a-1]);
                        } else {
                            distance = (x[a-1]-x[a])+(y[a-1]-x[a]);
                        }
                     }
                    if(distance%2 != (t[a]-t[a-1])%2||distance>t[a]-t[a-1]) {
                        break;
                    }

                } else {
                    //a==0
                    if((x[a]+y[a])%2 != t[a]%2||x[a]+y[a]>t[a]) {
                        break;
                    }
                }


                if(a!=N-1) {
                    a++;
                } else {
                    res = "Yes";
                    isJudgeEnd = true;
                }
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
    }
}