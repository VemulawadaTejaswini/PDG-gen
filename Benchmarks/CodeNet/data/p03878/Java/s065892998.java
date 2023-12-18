
import java.util.*;
import java.io.*;

public class Main
{
   public static void main(String[] args) throws Exception
   {
      PrintWriter out = new PrintWriter(System.out);
      new Main(new FastScanner(System.in), out);
      out.close();
   }

   public Main(FastScanner in, PrintWriter out)
   {
      int N = in.nextInt();

      int[] size = new int[2];
      Point[] vs = new Point[2*N];
      for (int x=0; x<2; x++)
         for (int i=0; i<N; i++)
            vs[i+x*N] = new Point(x, in.nextInt());
   
      Arrays.sort(vs);

      long MODO = 1_000_000_007;
      long res = 1L;
      for (Point p : vs)
      {
         if (size[1-p.t] > 0)
         {
            res *= size[1-p.t];
            res %= MODO;

            size[1-p.t]--;
         }
         else
         {
            size[p.t]++;
         }
      }
      out.println(res);
   }
}

class Point implements Comparable<Point>
{
   int t, i;

   Point(int tt, int ii)
   {
      t=tt; i=ii;
   }

   public int compareTo(Point rhs)
   {
      return Integer.compare(i, rhs.i);
   }
}

class FastScanner{
   private InputStream stream;
   private byte[] buf = new byte[1024];
   private int curChar;
   private int numChars;

   public FastScanner(InputStream stream)
   {
      this.stream = stream;
   }

   int read()
   {
      if (numChars == -1)
         throw new InputMismatchException();
      if (curChar >= numChars){
         curChar = 0;
         try{
            numChars = stream.read(buf);
         } catch (IOException e) {
            throw new InputMismatchException();
         }
         if (numChars <= 0)
            return -1;
      }
      return buf[curChar++];
   }

   boolean isSpaceChar(int c)
   {
      return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
   }
   
   boolean isEndline(int c)
   {
      return c=='\n'||c=='\r'||c==-1;
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

   String next(){
      int c = read();
      while (isSpaceChar(c))
         c = read();
      StringBuilder res = new StringBuilder();
      do{
         res.appendCodePoint(c);
         c = read();
      }while(!isSpaceChar(c));
      return res.toString();
   }
   
   String nextLine(){
      int c = read();
      while (isEndline(c))
         c = read();
      StringBuilder res = new StringBuilder();
      do{
         res.appendCodePoint(c);
         c = read();
      }while(!isEndline(c));
      return res.toString();
   }
}
