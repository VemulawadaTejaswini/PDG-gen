
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner s = new Scanner(System.in);
        int x = s.nextInt(),y=s.nextInt();
        boolean flag =false;

        if(y%2==1)flag=true;

        int max = y/2;
        int min = y/4 + (y%4)/2;

        if(x<min||x>max||flag){
            System.out.println("No");
        }
        else System.out.println("Yes");
    }
}





class Scanner
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
