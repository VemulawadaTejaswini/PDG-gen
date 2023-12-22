//package atcoder.beginnner_176;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws Exception {

        String s = "20 12 6";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N = nin(), X=nin(), T=nin();
        bw.write(((N/X)*T + (N%X==0?0:T)) + "\n");
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