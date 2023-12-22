//package atcoder.beginnner_176;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Integer> Ih = new Stack<>();
    static Stack<Integer> Iw = new Stack<>();

    public static void main (String[] args) throws Exception {

        String s = "4 4\n" +
                "1 1\n" +
                "4 4\n" +
                "#..#\n" +
                "####\n" +
                "##.#\n" +
                "###.";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int H = nin(), W=nin();
        rl(); int ch = nin()-1, cw=nin()-1;
        rl(); int dh = nin()-1, dw=nin()-1;

        char S[][] = new char[H][]; int G[][] = new int[H][];
        for (int h=0; h<H; ++h) {
            rl();S[h]=nca(); G[h]=new int[W];
        }

        
        if (ch==dh && cw==dw) {
            bw.write(0 + "\n");
        } else if (S[dh][dw]=='#') {
            bw.write(-1 + "\n");
        } else {
            int c=S[ch][cw]=='.'?1:2;
            Ih.push(ch); Iw.push(cw);
            while (G[dh][dw]==0 && !Ih.isEmpty()) {
                fill(S,G,H,W,c);
                ++c;
            }
            bw.write((G[dh][dw]==0?-1:G[dh][dw]-1)+"\n");
        }

        bw.flush();
    }

    static int m[][] = new int[][]{new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}};

    static void fill(char S[][], int G[][], int H, int W, int c) {
        Set<Integer> B = new HashSet<>();
        while (!Ih.isEmpty()) {
            int _h = Ih.pop(); int _w=Iw.pop();
            if (G[_h][_w]==c) continue;
            if (S[_h][_w]=='.') {
                G[_h][_w]=c;
            } else {
                B.add((_h*10000)+_w);
                continue;
            }
            for (int[] _m:m) {
                int h2=_h+_m[0]; int w2=_w+_m[1];
                if (h2>H-1 || h2<0 || w2>W-1 || w2<0) continue;
                Ih.push(h2); Iw.push(w2);
            }
        }

        for (int b:B) {
            int _h=b/10000, _w=b%10000;
            for (int[] _m:m) {
                int h2=_h+_m[0]; int w2=_w+_m[1];
                if (h2>H-1 || h2<0 || w2>W-1 || w2<0) continue;
                if (S[h2][w2]=='#' || G[h2][w2]!=0) continue;
                Ih.push(h2); Iw.push(w2);
            }
        };
    }

    static BufferedReader br; static BufferedWriter bw; static StringTokenizer st;
    static void rl() throws Exception{ st = new StringTokenizer(br.readLine()); }
    static long nlo(){ return Long.parseLong(st.nextToken()); }
    static int nin(){ return Integer.parseInt(st.nextToken()); }
    /*private static void te(){}*/
    static double ndo(){ return Double.parseDouble(st.nextToken()); }
    static char[] nca(){ return st.nextToken().toCharArray(); }
}
