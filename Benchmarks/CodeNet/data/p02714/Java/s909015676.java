import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long res = 0;
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int[] R = new int[n+1];
        int[] G = new int[n+1];
        int[] B = new int[n+1];

        int sum = 'R' + 'G' + 'B';

        for (int i = n - 1; i >= 0; i--) {
            R[i] = R[i+1];
            G[i] = G[i+1];
            B[i] = B[i+1];

            if (arr[i] == 'R') {
                R[i] = R[i] + 1;
            }
            if (arr[i] == 'G') {
                G[i] = G[i] + 1;
            }
            if (arr[i] == 'B') {
                B[i] = B[i] + 1;
            }
        }


        for (int i = 0; i < n; i++) {
            char cur = arr[i];
            for (int j = i + 1; j < n-1; j++) {
                if (arr[j] == cur) continue;
                char curcur = arr[j];
                char need = (char)(sum - cur - curcur);
                if (need =='R') {
                    res += R[j+1];
                    int diff = j - i;
                    int k = j + diff;
                    if (k < n && arr[k] == need) {
                        res--;
                    }
                }
                if (need =='G') {
                    res += G[j+1];
                    int diff = j - i;
                    int k = j + diff;
                    if (k < n && arr[k] == need) {
                        res--;
                    }
                }
                if (need =='B') {
                    res += B[j+1];
                    int diff = j - i;
                    int k = j + diff;
                    if (k < n && arr[k] == need) {
                        res--;
                    }
                }
            }
        }

        out.println(res);
        out.flush();
        out.close();
    }

//    private static int gcd(int a, int b, int c) {
//        BigInteger A = BigInteger.valueOf(a);
//        BigInteger B = BigInteger.valueOf(b);
//        BigInteger C = BigInteger.valueOf(c);
//        return C.gcd(A.gcd(B)).intValue();
//    }

    private static void solve(double x, ArrayList<Long> arr, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (1.0 * sum / n >= x) System.out.println(n);
        else {
            Collections.sort(arr);
            long cur = 0;
            long people = 0;
            for (int i = n - 1; i >= 0; i--) {
                cur += arr.get(i);
                people++;
                if (1.0 * cur / people < x) {
                    System.out.println(people - 1);
                    return;
                }
            }
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

/**
 *x=3
 * 1 1 2 5
 */

/**
 *
 *  1+1
 **/