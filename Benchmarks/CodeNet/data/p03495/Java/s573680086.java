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

class Pair implements Comparable<Pair> {
    int val, cnt;
    Pair(int v, int c) {
        this.val = v; this.cnt = c;
    }
    public int compareTo(Pair o) {
        return o.cnt - this.cnt;
    }
}

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] map = new int[200001];
        ArrayList<Pair> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            map[tmp]++;
        }
        for (int i = 1; i <= n; i++) {
            if (map[i] != 0) {
                array.add(new Pair(i, map[i]));
            }
        }
        Collections.sort(array);
        int sz = array.size(), cnt = 0;
        while (sz > k) {
            sz--;
            cnt += array.get(sz).cnt;
        }
        System.out.println(cnt);
    }

    static public void main(String[] args) {
        new Main().run();
    }
}