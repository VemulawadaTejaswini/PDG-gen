import java.util.*;
import java.io.*;

public class Main {


    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] cnt = new int[3];
        cnt[0] = in.nextInt();
        cnt[1] = in.nextInt();
        cnt[2] = in.nextInt();

        long total = 1L * cnt[0] + cnt[1] + cnt[2];
        if (total == 0) {
            out.println("No");
            return;
        }

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = in.next();
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int j = S[i].charAt(0) - 'A';
            int k = S[i].charAt(1) - 'A';
            if (cnt[j] == 0 && cnt[k] == 0) {
                out.println("No");
                return;
            } else if (cnt[j] == 0) {
                res.append(S[i].charAt(0)).append('\n');
                cnt[j]++;
                cnt[k]--;
            } else if (cnt[k] == 0) {
                res.append(S[i].charAt(1)).append('\n');
                cnt[k]++;
                cnt[j]--;
            } else if (cnt[j] == 1 && cnt[k] == 1) {
                if (total == 2 && i < N - 1) {
                    int nj = S[i + 1].charAt(0) - 'A';
                    int nk = S[i + 1].charAt(1) - 'A';
                    if (nj == j || nk == j) {
                        res.append(S[i].charAt(0)).append('\n');
                        cnt[j]++;
                        cnt[k]--;
                    } else {
                        res.append(S[i].charAt(1)).append('\n');
                        cnt[k]++;
                        cnt[j]--;
                    }
                } else {
                    res.append(S[i].charAt(0)).append('\n');
                    cnt[j]++;
                    cnt[k]--;
                }
            } else {
                res.append(S[i].charAt(0)).append('\n');
                cnt[j]++;
                cnt[k]--;
            }
        }
        out.println("Yes");
        out.print(res);
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
