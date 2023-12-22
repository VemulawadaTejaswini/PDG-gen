//package atcoder.beginnner_176;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "1\n" +
                "1 2";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N = nin();
        long m=0;
        long ph=0;
        rl(); for (int i=0; i<N; ++i) {
            long h=nlo();
            if (h<ph) m+=(ph-h);
            ph=Math.max(h, ph);
        }
        bw.write(m + "\n");
        bw.flush();
    }

    static BufferedReader br; static BufferedWriter bw; static StringTokenizer st;
    static void rl() throws Exception{ st = new StringTokenizer(br.readLine()); }
    static long nlo(){ return Long.parseLong(st.nextToken()); }
    static int nin(){ return Integer.parseInt(st.nextToken()); }
    /*private static void te(){}*/
    static double ndo(){ return Double.parseDouble(st.nextToken()); }
    static char[] nca(){ return st.nextToken().toCharArray(); }
}
