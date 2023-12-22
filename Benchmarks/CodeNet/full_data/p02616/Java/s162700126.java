import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        IO io = new IO();
        int n = io.nextInt();
        int k = io.nextInt();

        List<Integer> nums = new ArrayList<>();
        //List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int v = io.nextInt();
            nums.add(v);
        }

        int mod = 1000000007;
        Collections.sort(nums);
        
        long v;
        if (k % 2 == 0) {
            v = even(nums, 0, n - 1, k);
        } else {
            if (nums.get(n-1) < 0) {
                v = product(nums, k);
            } else if (nums.get(0) == 0) {
                v = 0;
            } else {
                v = even(nums, 0, n - 2, k - 1);
                v = (v * nums.get(n-1)) % mod;
            }
        }

        io.write((v + mod) % mod);
    }

    private static long product(List<Integer> nums, int k) {
        long pro = 1;
        int mod = 1000000007;
        int n = nums.size();
        int i = 1;
        while(k > 0) {
            pro = (pro * (long)nums.get(n-i)) % mod;
            k--;
            i++;
        }
        return pro;
    }

    private static long even(List<Integer> nums, int i, int j, int k) {

        if (k == 0) {
            return 1L;
        }

        int mod = 1000000007;
        long f1 = nums.get(i);
        long f2 = nums.get(i+1);

        long s1 = nums.get(j);
        long s2 = nums.get(j-1);

        long v;
        if (f1 * f2 >= s1 * s2) {
           v = even(nums, i + 2, j, k - 2);
           v = (v * f1) % mod;
           v = (v * f2) % mod;
        } else {
           v = even(nums, i, j - 2, k - 2);
           v = (v * s1) % mod;
           v = (v * s2) % mod;
        }

        return v;
    }

    static class IO {
        BufferedWriter bw;
        BufferedReader br;
        StringTokenizer st;

        public IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void write(String s) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }  
        }

        public void write(long value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(boolean b, String truev, String falsv) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(b ? truev : falsv);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(long[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
 
        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nIntA(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nLongA(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public double[] nDoubleA(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextDouble();
            }
            return a;
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}