import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int N = scanner.nextInt();
        long[] list = new long[N];
        for (int i = 0; i < N; i++) {
            list[i] = (long)scanner.nextInt();
        }
        long lcm = lcm(list) - 1;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += lcm % list[i];
        }
        System.out.println(sum);
    }

    public static long lcm(long... arr) {
        if (arr.length == 1) return arr[0];
        if (arr.length == 2) return lcmImpl(arr[0], arr[1]);
        long[] newArr = new long[arr.length -1];
        System.arraycopy(arr, 2, newArr, 1, arr.length - 2);
        newArr[0] = lcmImpl2(arr[0], arr[1]);
        return lcm(newArr);
    }

    static long lcmImpl2(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return c/b;
    }

    public static long lcmImpl(long m, long n) {
        return java.math.BigInteger.valueOf(m).multiply(java.math.BigInteger.valueOf(n)).divide(java.math.BigInteger.valueOf(gcd(m, n))).longValue();
    }

    public static long gcd(long m, long n) {
        return java.math.BigInteger.valueOf(m).gcd(java.math.BigInteger.valueOf(n)).longValue();
    }


    private class MyScanner {
        String[] s;int i;BufferedReader br;String reg = " ";
        MyScanner () { s = new String[0];i = 0;br = new BufferedReader(new InputStreamReader(System.in)); }
        public String next() {
            try {
                if (i < s.length) return s[i++]; String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0); i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}
