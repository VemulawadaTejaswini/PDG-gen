import java.io.*;
import java.util.*;
public class q1
{
  public static void main(String args[])throws IOException
  {
    FastReader in=new FastReader();
    PrintWriter pw=new PrintWriter(System.out, true);
    int a=in.nextInt();
    int b=in.nextInt();
    int x=in.nextInt();
    b+=a;
    pw.println(b>=x && a<=x?"YES":"NO");
  }
}
class FastReader
  {
      BufferedReader br;
      StringTokenizer st;

      public FastReader()
      {
          br = new BufferedReader(new
                   InputStreamReader(System.in));
      }

      String next()
      {
          while (st == null || !st.hasMoreElements())
          {
              try
              {
                  st = new StringTokenizer(br.readLine());
              }
              catch (IOException  e)
              {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int nextInt()
      {
          return Integer.parseInt(next());
      }

      long nextLong()
      {
          return Long.parseLong(next());
      }

      double nextDouble()
      {
          return Double.parseDouble(next());
      }

      String nextLine()
      {
          String str = "";
          try
          {
              str = br.readLine();
          }
          catch (IOException e)
          {
              e.printStackTrace();
          }
          return str;
      }
  }
