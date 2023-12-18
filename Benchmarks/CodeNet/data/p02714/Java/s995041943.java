/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/abc162_d

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    char[] geto(char c) {
        char a, b;
        if(c=='R') {
            a = 'G'; b = 'B';
        } else if(c=='G') {
            a = 'R'; b = 'B';
        } else {
            a = 'G'; b = 'R';
        }
        return new char[]{a, b};
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        char[] s = in.next().trim().toCharArray();
        long rs = 0;
        for(int i=0; i<n; i++) {
            char curr = s[i];
            char[] o = geto(curr);
            int[] cnt = new int[2];

            // show("i", i, s[i]);

            for(int j=0; j<i; j++) {
                // show("j", j, s[j], o, cnt);
                int l = i - j + 1;
                int k = j - l + 1;
                if(s[j]==o[0]) {
                    rs += cnt[1];
                    if(k>=0 && s[k]==o[1]) {
                        rs--;
                    }
                    cnt[0]++;
                } else if(s[j]==o[1]) {
                    rs += cnt[0];
                    if(k>=0 && s[k]==o[0]) {
                        rs--;
                    }
                    cnt[1]++;
                }
            }
            // show("rs", rs);
        }
        out.println(rs);
    }
    

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        out.close();
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}