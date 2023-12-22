import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
                          /*****Code by Ayush Bahuguna.*****/
class Reader
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    static float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }
}

class chocolate
{
    //static final int MOD=998244353;
    public static void main(String[] args) throws IOException
    {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        Reader.init(System.in);
        int test = 1;
        for (int ii = 0; ii < test; ii++)
        {
            int n=Reader.nextInt();
            int a=Reader.nextInt();
            int b=Reader.nextInt();
            int c=Reader.nextInt();
            String ar[]=new String[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=Reader.next();
            }
            boolean flag=true;
            StringBuffer str=new StringBuffer();
            for (int i=0;i<n;i++)
            {
                if(ar[i].equals("AB"))
                {
                    if (a>b)
                    {
                        a-=1;
                        b+=1;
                        str.append('B');
                    }
                    else
                    {
                        a+=1;
                        b-=1;
                        str.append('A');
                    }
                    if (a<0||b<0)
                    {
                        flag=false;
                        break;
                    }
                }
                else if (ar[i].equals("AC"))
                {
                    if(a>c)
                    {
                        a-=1;
                        c+=1;
                        str.append('C');
                    }
                    else
                    {
                        a+=1;
                        c-=1;
                        str.append('A');
                    }
                    if (a<0||c<0)
                    {
                        flag=false;
                        break;
                    }
                }
                else
                {
                    if (b>c)
                    {
                        b-=1;c+=1;
                        str.append('C');
                    }
                    else
                    {
                        b+=1;c-=1;
                        str.append('B');
                    }
                    if (c<0||b<0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if (flag)
            {
                System.out.println("YES");
                for (int i=0;i<str.length();i++)System.out.println(str.charAt(i));
            }
            else
            {
                System.out.println("NO");
            }
        }
        out.flush();
        out.close();
    }
}
