//package AtCoder.C114;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    public static void main(String[] args) {
        int n = in.NI(),m = in.NI();
        String s = in.next();

        if (s.charAt(n-1)=='1') {
            out.println(-1);
            out.close(); return;
        }

        int[] mindis = new int[s.length()];
        Arrays.fill(mindis, -1);
        mindis[0]=0;
        int poi = 1;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='1' || mindis[i]==-1) continue;
            while(poi < s.length() && poi <= i + m) {
                if (s.charAt(poi)=='1') { poi++; continue;}
                mindis[poi]= mindis[i]+1;
                poi++;
            }
        }

        if (mindis[s.length()-1]==-1) {
            out.println(-1); out.close();
            return;
        }

        int[] ans = new int[mindis[s.length()-1]+1];
        Arrays.fill(ans, -1);

        for (int i=0;i<mindis.length;i++) {
            if (mindis[i] !=-1 && ans[mindis[i]]==-1)
                ans[mindis[i]] = i;
        }

        ans[ans.length - 1] = s.length()-1;

        for (int i=1;i<ans.length;i++) {
            out.printf("%d ", ans[i]- ans[i-1]);
        }

        out.close();

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }

}
