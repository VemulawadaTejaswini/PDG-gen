

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int h = s.nextInt();
        int w = s.nextInt();
        int k = s.nextInt();
        char [][] arr = new char[h][w];
        String s1;
        int bl,wh;
        bl=0;
        wh=0;
        for(int i=0;i<h;i++){
            s1=s.next();
            for(int j=0;j<w;j++){
                arr[i][j]=s1.charAt(j);
            }
        }
        int res=0;
        for (int i = 0; i < (1 << h); ++i) {
            for (int j = 0; j < (1 << w); ++j) {
                int cur = 0;
                for (int l = 0; l < h; ++l) {
                    for (int m = 0; m < w; ++m) {
                        if (((i&(1 << l))!=0) || (j & (1 << m)) !=0) {
                            continue;
                        }
                        if(arr[l][m] == '#')
                            cur++;
                    }
                }
                if(cur==k)
                    res++;
            }
        }
        System.out.println(res);
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


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