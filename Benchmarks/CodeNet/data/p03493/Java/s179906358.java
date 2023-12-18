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

public class Solution {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
        }
        System.out.println(cnt);
    }

    static public void main(String[] args) {
        new Solution().run();
    }
}