import java.util.*;
import java.io.*;

public class Main {
    static long sum;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int [][] moves = new int[n][2];
        int at = 0; int bt = 0; int ct = 0;
        sum = a + b + c;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            moves[i][0] = s.charAt(0) - 65;
            moves[i][1] = s.charAt(1) - 65;
            for (int j = 0; j < 2; j++) {
                if (moves[i][j] == 0) at++;
                else if (moves[i][j] == 1) bt++;
                else ct++;
            }
        }
        int ah = a + at; int bh = b + bt; int ch = c + ct;
        int al = ((a - at) % 2 == 0 ? Math.max(0, a - at) : Math.max(1, a - at));
        int bl = ((b - bt) % 2 == 0 ? Math.max(0, b - bt) : Math.max(1, b - bt));
        int cl = ((c - ct) % 2 == 0 ? Math.max(0, c - ct) : Math.max(1, c - ct));
        long ad = -1; long bd = -1; long cd = -1;
        if (check(al, bl, cl, ch)) {
            ad = al; bd = bl; cd = sum - ad - bd;
        } else if (check(al, bh, cl, ch)) {
            ad = al; bd = bh; cd = sum - ad - bd;
        } else if (check(ah, bl, cl, ch)) {
            ad = ah; bd = bl; cd = sum - ad - bd;
        } else if (check(ah, bh, cl, ch)) {
            ad = ah; bd = bh; cd = sum - ad - bd;
        } else if (check(al, cl, bl, bh)) {
            ad = al; cd = cl; bd = sum - cd - ad;
        } else if (check(al, ch, bl, bh)) {
            ad = al; cd = ch; bd = sum - cd - ad;
        } else if (check(ah, cl, bl, bh)) {
            ad = ah; cd = cl; bd = sum - cd - ad;
        } else if (check(ah, ch, bl, bh)) {
            ad = ah; cd = ch; bd = sum - cd - ad;
        } else if (check(bl, cl, al, ah)) {
            bd = bl; cd = cl; ad = sum - cd - bd;
        } else if (check(bh, cl, al, ah)) {
            bd = bh; cd = cl; ad = sum - cd - bd;
        } else if (check(bl, ch, al, ah)) {
            bd = bl; cd = ch; ad = sum - cd - bd;
        } else if (check(bh, ch, al, ah)) {
            bd = bh; cd = ch; ad = sum - cd - bd;
        }
        if (ad == -1) {
            out.println("No");
        } else {
            out.println("Yes");
            int [] p = new int[3];
            long [] maxp = new long[]{(at + ad - a) / 2, (bt + bd - b) / 2, (ct + cd - c) / 2};
            String [] conv = new String[]{"A", "B", "C"};
            for (int i = 0; i < n; i++) {
                int first = moves[i][0]; int second = moves[i][1];
                if (p[first] < maxp[first]) {
                    p[first]++;
                    out.println(conv[first]);
                } else {
                    p[second]++;
                    out.println(conv[second]);
                }
            }
        }
        out.close();
    }


    static boolean check(int first, int second, int lower, int upper) {
        return (sum - first - second >= lower) && (sum - first - second <= upper);
    }




    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}