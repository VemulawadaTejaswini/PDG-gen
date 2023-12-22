//package atcoder.beginner179;

import java.io.*;
import java.util.*;

public class Main {
    static InputReader in;
    static PrintWriter out;

    public static void main(String[] args) {
        //initReaderPrinter(true);
        initReaderPrinter(false);
        //solve(in.nextInt());
        solve(1);
    }

    static void solve(int testCnt) {
        for (int testNumber = 0; testNumber < testCnt; testNumber++) {
            long n = in.nextLong();
            long x = in.nextLong();
            int m = in.nextInt();
            int[] remainderToIdx = new int[m];
            Arrays.fill(remainderToIdx, -1);
            int i = 0;
            long ans = 0;
            List<Long> list = new ArrayList<>();

            while(i < n) {
                if(remainderToIdx[(int)x] < 0) {
                    list.add(x);
                    ans += x;
                    remainderToIdx[(int)x] = i;
                    x = x * x % m;
                    i++;
                }
                else {
                    long sum = 0;
                    for(int j = remainderToIdx[(int)x]; j < i; j++) {
                        sum += list.get(j);
                    }
                    long cnt1 = (n - i) / (i - remainderToIdx[(int)x]);
                    long cnt2 = (n - i) % (i - remainderToIdx[(int)x]);
//                    System.out.println("cnt1: " + cnt1);
//                    System.out.println("cnt2: " + cnt2);
//                    System.out.println("x: " + x);
//                    System.out.println(list.size());
                    ans += cnt1 * sum;
                    for(long k = 0; k < cnt2; k++) {
                        ans += list.get(remainderToIdx[(int)x] + (int)k);
                    }
                    break;
                }
            }

            out.println(ans);
        }
        out.close();
    }

    static void initReaderPrinter(boolean test) {
        if (test) {
            try {
                in = new InputReader(new FileInputStream("src/input.in"));
                out = new PrintWriter(new FileOutputStream("src/output.out"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            in = new InputReader(System.in);
            out = new PrintWriter(System.out);
        }
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        InputReader(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream), 32768);
            } catch (Exception e) {
                e.printStackTrace();
            }
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

        Integer[] nextIntArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        Long[] nextLongArray(int n) {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }
}


