// package atcoder.beginner_170;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "10\n" +
                "33 18 45 28 8 19 89 86 2 4";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N=nin();
        int[] set = new int[1_000_001];
        rl();
        int A[] = new int[N];
        for (int i=0; i<N; ++i) {
            int v=nin();
            A[i] = v;
            if (set[v] < 2) {
                for (int j=v; j<=1_000_000; j+=v) {
                    ++set[j];
                }
            }
        }

        int counter = 0;
        for (int i=0; i<N; ++i) {
            if (set[A[i]]==1) ++counter;
        }

        bw.write(Integer.toString(counter));
        bw.newLine();
        bw.flush();

    }

    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static void rl() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    static long nlo(){
        return Long.parseLong(st.nextToken());
    }
    static int nin(){
        return Integer.parseInt(st.nextToken());
    }
    /*private static void te(){
      }*/
    static double ndo(){
        return Double.parseDouble(st.nextToken());
    }
    static char[] nca(){
        return st.nextToken().toCharArray();
    }
    static String nstr(){
        return st.nextToken();
    }
}