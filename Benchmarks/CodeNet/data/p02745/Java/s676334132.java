import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static public class pair {
        int u;
        int idx;
        int val;

        public pair(int x, int i) {
            u = x;
            idx = i;
            val = -1;
        }
    }



    static ArrayList<pair>[] adj;
    static int[] Arr, Arry;
    static int inf = (int) 1e9,n;
    static boolean[][] matrix;
    static long[][] memo;
    static long mod = 998244353;
    public static  boolean sub(String a,String b){
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) == b.charAt(i) || a.charAt(i) =='?' || b.charAt(i) == '?')
                continue;
            return false;
        }
        return true;
    }
public static  int inter (String a,String b){
    int n=min(a.length(),b.length());
    while(n>0){
        if(sub(a.substring(a.length()-n),(b.substring(0,n))))
            return n;
        n--;
    }
    return 0;
}
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        int ans=a.length()+b.length()+c.length();
        //abc
        int min=ans;
        min=Math.min(min, ans-inter(a, b+c)-inter(b, c));
        min=Math.min(min, ans-inter(a, c+b)-inter(c, b));
        min=Math.min(min, ans-inter(b, a+c)-inter(a, c));
        min=Math.min(min, ans-inter(b, c+a)-inter(c, a));
        min=Math.min(min, ans-inter(c, a+b)-inter(a, b));
        min=Math.min(min, ans-inter(c, b+a)-inter(b, a));
        pw.println(min);
        pw.close();
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));

        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
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
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException, IOException {
            return br.ready();
        }

    }
}
