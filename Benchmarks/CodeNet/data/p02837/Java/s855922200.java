import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        // Failed to predict input format
        int N = sc.nextInt();
        int[] A = new int[N];
        int[][] x = new int[N][];
        char[][] y = new char[N][];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            x[i] = new int[A[i]];
            y[i] = new char[A[i]];
            for (int j = 0; j < A[i]; j++) {
                x[i][j] = sc.nextInt() - 1;
                y[i][j] = sc.nextChar();
            }
        }

        int ans = 0;
        for (int i = 0; i < Math.pow(2, N) - 0.1; i++) {
            String bytemap = Integer.toBinaryString(i);
            char[] bytearray = bytemap.toCharArray();
            ArrayList<Character> bytelist = new ArrayList<>();
            for (int j = 0; j < bytearray.length; j++) {
                bytelist.add(bytearray[bytearray.length - j - 1]);
            }
            while(bytelist.size() < N) bytelist.add('0');
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if(bytelist.get(j) == '1') {
                    for (int j2 = 0; j2 < x[j].length; j2++) {
                        int xj = x[j][j2];
                        char yj = y[j][j2];
                        if(bytelist.get(xj) != yj) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag && ans < Integer.bitCount(i)) ans = Integer.bitCount(i);
        }
        System.out.println(ans);
    }



    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
