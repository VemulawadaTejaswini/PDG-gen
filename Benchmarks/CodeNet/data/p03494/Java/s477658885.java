import static java.lang.Math.*;
import static  java.util.Arrays.*;
import java.io.*;
import java.util.*;

class Scanner {
    BufferedReader br;
    StringTokenizer st;
    Scanner(InputStream in) {
        br = new BufferedReader(new InputStreamReader(in));
        eat("");
    }
    void eat(String s) {
        st = new StringTokenizer(s);
    }
    String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }
    boolean hasNext() {
        while (!st.hasMoreTokens()) {
            String s = nextLine();
            if (s == null) return false;
            eat(s);
        }
        return true;
    }
    String next() {
        hasNext();
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
}

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] cnt = new int[n];
        int res = 0x3f3f3f3f;
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            cnt[i] = Integer.lowestOneBit(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            res = min(res, cnt[i]);
        }
        int ret = 0;
        while (res % 2 == 0) {
            ret++;
            res /= 2;
        }
        System.out.println(ret);
    }

    static public void main(String[] args) {
        new Main().run();
    }
}