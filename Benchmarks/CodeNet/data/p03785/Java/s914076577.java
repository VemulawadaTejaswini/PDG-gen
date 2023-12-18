import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    int N,C,K;
    int[] T;

    public void randomSort(int[] array) {
        for(int i = 0;i < array.length;i++) {
            int ri = (int)(Math.random() * array.length);
            int tmp = T[i];
            T[i] = T[ri];
            T[ri] = tmp;
        }
    }

    public void solve() {
        N = nextInt();
        C = nextInt();
        K = nextInt();

        T = new int[N];
        for(int i = 0;i < N;i++) {
            T[i] = nextInt();
        }

        randomSort(T); //Arrays.sort()の最悪ケース対策
        Arrays.sort(T);

        int minTime = Integer.MAX_VALUE; //バスの到着時間の最小値
        int nowC = 0; //現在の乗客数
        int ans = 0; //必要なバスの数の最小値
        for(int i = N - 1;i >= 0;i--){
            if(T[i] + K < minTime || nowC >= C) {
                minTime = T[i];
                nowC = 0;
                ans++;
            }
            nowC++;
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}