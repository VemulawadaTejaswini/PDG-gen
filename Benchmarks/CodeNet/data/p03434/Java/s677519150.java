import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static PrintWriter out;
    static Scanner sc;

    static void solve() {
        int n = nextInt();
        List<Integer> list = nextIntList(n);

        sort(list);

        int ans = 0;
        boolean isAliceTurn = true;
        for (int i = n - 1; i >= 0; i--) {
            if (isAliceTurn) {
                ans += list.get(i);
                isAliceTurn = !isAliceTurn;
            } else {
                ans -= list.get(i);
                isAliceTurn = !isAliceTurn;
            }
        }
        System.out.println(ans);
    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static String nextString() {
        return sc.next();
    }

    static int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static List<Integer> nextIntList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }
        return list;
    }

    static List<Long> nextLongList(int n) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextLong());
        }
        return list;
    }

    static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    // greatest common divisor
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

    // intをlength桁のbit文字列に変換
    static String toBinaryString(int input, int length) {
        return toBinaryString(input).substring(29 - length);
    }

    // intを29桁のbit文字列に変換
    static String toBinaryString(int input) {
        String ret = "";
        int max = 0x10000000;
        for (int i = 0; i < 29; i++) {
            int tmp = input / max;
            ret += tmp;
            input %= max;
            max /= 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
