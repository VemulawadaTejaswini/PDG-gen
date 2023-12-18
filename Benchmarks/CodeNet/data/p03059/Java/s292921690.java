import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.lang.management.MemoryType;
import java.math.BigInteger;
import java.util.*;


public class Main {



        public static void main (String[]args) throws IOException {
        Scanner in = new Scanner(System.in);
        try(PrintWriter or = new PrintWriter(System.out)){

          int a= in.nextInt(),b=in.nextInt();
          double t=1.0*in.nextInt()+.5;
          double ans=0;
            for (double i = 1.0*a; i <=t; i+=(1.0*a)) {
                    ans+=b;
            }
            or.println((int)ans);





        }


    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++) {
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec) {
                        f *= 10;
                    }
                }
            }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}

class prog {

    int skill;
    int indx;
    int pp;

    public prog(int skill, int indx) {
        this.skill = skill;
        this.indx = indx;
        pp = 0;
    }

    @Override
    public String toString() {
        return "prog{" + "skill=" + skill + ", indx=" + indx + ", pp=" + pp + '}';
    }

}