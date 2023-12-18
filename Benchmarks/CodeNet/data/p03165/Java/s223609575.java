import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static String[][]memo;
    static String s,m;
    static boolean issub(String a){
       if (a==null)return false;
        int i=0,j=0;
        while (i<a.length()&&j<m.length()){
            if (m.charAt(j)==a.charAt(i)){
                i++;
            }
            j++;
        }
        return i==a.length();
    }
    static String dp(int id,int id2) {
        if (id==s.length()||id2==m.length())return "";
        if (memo[id][id2]!=null){
            return memo[id][id2];
        }
        String x1="";
        if (s.charAt(id)==m.charAt(id2)){
            x1=s.charAt(id)+dp(id+1,id2+1);
        }
        String x2=dp(id+1,id2);
        String x3=dp(id,id2+1);
        String ans="";
        if (x1.length()>x2.length()) {
            ans = x1;
        }
        else ans =x2;
        if (x3.length()>ans.length())ans=x3;
        return memo[id][id2]=ans;
        }

    public  static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        s=sc.nextLine();
        m = sc.nextLine();
        memo= new String[s.length()+1][m.length()+1];
        pw.println(dp(0,0));
       // pw.println(Arrays.deepToString(memo));
      pw.flush();
    }
    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }

        public boolean ready() throws IOException {return br.ready();}


    }
}