import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int[] nk = intarr();
        int n = nk[0];
        int k = nk[1];
        int[][] pts = new int[n][];
        for(int i=0;i<n;i++) {
            String[] h = split(rd.readLine());
            pts[i] = new int[] { pint(h[0]), pint(h[1]), h[2].charAt(0)=='W'?1:0 };
        }
        out(solve(k,pts));
    }

    private int solve(int k, int[][] pts) {
        int e = 2*k;
        int[][][] p = new int[2][e][e];
        for(int[] a: pts) {
            p[a[2]][a[0] % e][a[1] % e]++;
        }
        int[][][] s = new int[2][e][e];
        for(int q=0;q<2;q++) {
            s[q][0][0] = p[q][0][0];
            for (int i = 1; i < e; i++) {
                s[q][i][0] = s[q][i-1][0] + p[q][i][0];
                s[q][0][i] = s[q][0][i-1] + p[q][0][i];
            }
            for (int i = 1; i < e; i++) {
                for (int j = 1; j < e; j++) {
                    s[q][i][j] = s[q][i-1][j] + s[q][i][j-1] - s[q][i-1][j-1] + p[q][i][j];
                }
            }
        }
        int best = 0;
        for(int i=0;i<e;i++) {
            for(int j=0;j<e;j++) {
                int all = 0;
                for(int u=-2;u<=1;u++) {
                    for(int v=-2;v<=1;v++) {
                        int lx = i + u*k;
                        int ly = j + v*k;

                        if(lx + k > 0 && lx < e && ly + k > 0 && ly < e) {
                            int rx = max(lx,0);
                            int ry = max(ly,0);
                            int rw = lx + k <= e?(lx + k - rx):(e - rx);
                            int rh = ly + k <= e?(ly + k - ry):(e - ry);

                            int color = (100 + u + v)%2;
                            int sum = s[color][rx+rw-1][ry+rh-1];
                            if(rx > 0) {
                                sum -= s[color][rx-1][ry+rh-1];
                            }
                            if(ry > 0) {
                                sum -= s[color][rx+rw-1][ry-1];
                            }
                            if(rx > 0 && ry > 0) {
                                sum += s[color][rx-1][ry-1];
                            }
                            all += sum;
                        }
                    }
                }
                best = max(best, all);
            }
        }
        return best;
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private int[] intarr() throws IOException {
        return intarr(rd.readLine());
    }

    private int[] intarr(String s) {
        String[] q = split(s);
        int n = q.length;
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(q[i]);
        }
        return a;
    }

    private String[] split(String s) {
        if(s == null) {
            return new String[0];
        }
        int n = s.length();
        int start = -1;
        int end = 0;
        int sp = 0;
        boolean lastWhitespace = true;
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(isWhitespace(c)) {
                lastWhitespace = true;
            } else {
                if(lastWhitespace) {
                    sp++;
                }
                if(start == -1) {
                    start = i;
                }
                end = i;
                lastWhitespace = false;
            }
        }
        if(start == -1) {
            return new String[0];
        }
        String[] res = new String[sp];
        int last = start;
        int x = 0;
        lastWhitespace = true;
        for(int i=start;i<=end;i++) {
            char c = s.charAt(i);
            boolean w = isWhitespace(c);
            if(w && !lastWhitespace) {
                res[x++] = s.substring(last,i);
            } else if(!w && lastWhitespace) {
                last = i;
            }
            lastWhitespace = w;
        }
        res[x] = s.substring(last,end+1);
        return res;
    }

    private boolean isWhitespace(char c) {
        return c==' ' || c=='\t';
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
