//package atcoder.AGC_45;

import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "1\n" +
                "7\n" +
                "4 2 3 4 5 6 7\n" +
                "0111000";


//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int T = nin();

        next_test:
        for (int t=0; t<T; ++t) {
            rl(); int N=nin();
            rl(); long A[] = new long[N]; for (int i=0; i<N; ++i) A[i] = nlo();
            rl(); char[] S = nca();

            int i=S.length-1;
            while (i>=0 && S[i]=='1') {
                if (A[i]!=0) {
                    bw.write("1");
                    bw.newLine();
                    continue next_test;
                }
                --i;
            }

            HashSet<Long> toWin=new HashSet<>();
            toWin.add(0L);

            while (i>=0) {
                HashSet<Long> perm_0 = new HashSet<>();
                perm_0.add(0L);
                while (i>=0 && S[i]=='0') {
                    HashSet<Long> _perm_0 = new HashSet<>();
                    for (long l:perm_0) _perm_0.add(l^A[i]);
                    perm_0.addAll(_perm_0);
                    --i;
                }
                HashSet<Long> win_numbers_for_0 = new HashSet<>();
                for (long w:toWin) for (long p:perm_0) win_numbers_for_0.add(w^p);

                HashSet<Long> perm_1 = new HashSet<>();
                perm_1.add(0L);
                while (i>=0 && S[i]=='1') {
                    HashSet<Long> _perm_1 = new HashSet<>();
                    for (long l:perm_1) _perm_1.add(l^A[i]);
                    perm_1.addAll(_perm_1);
                    --i;
                }

                HashMap<Long, Integer> map = new HashMap<>();
                for (long w:win_numbers_for_0) {
                    for (long l:perm_1) {
                        long lw=l^w;
                        if (!map.containsKey(lw)) map.put(lw, 1); else map.put(lw, map.get(lw)+1);
                    }
                }

                if (map.size()==0) {
                    toWin = win_numbers_for_0;
                } else {
                    toWin.clear();
                    for (Map.Entry<Long, Integer> e:map.entrySet()) if (e.getValue()>=perm_1.size()) toWin.add(e.getKey());
                }

            }

            bw.write(toWin.contains(0L) ? "0" : "1");
            bw.newLine();
        }
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