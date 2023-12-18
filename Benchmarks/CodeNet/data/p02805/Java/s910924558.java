import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Main
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input)
    {
        reader = new BufferedReader( new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException
    {
        while ( ! tokenizer.hasMoreTokens() )
        {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }
 
    static long nextInt() throws IOException
    {
        return Long.parseLong( next() );
    }
    static PrintWriter writer;
    static void outit(OutputStream outputStream)
    {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
    static void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }
 
    static void println(Object...objects) {
        print(objects);
        writer.println();
    }
 
    static void close() {
        writer.close();
    }
 
    static void flush() {
        writer.flush();
    }
    public static void main(String [] args) throws IOException
    {
        init(System.in) ;
        outit(System.out) ;
//      int t = (int) nextInt() ;
//      for(int i =0 ; i<t ; i++)
        output() ;
        flush();
        close();
    }
    public static int p(int i)
    {
      return (int)Math.pow(2,i) ;
    }
    static long [] a ;
    static long  p ;
    static long [] tree ;
    static long [] x ;
    static long [] y ;
    static double pi = 3.14159 ;
    public static void output() throws IOException
    {
      int n = (int)nextInt() ;
      int m = n ;
      ArrayList<Point> ar = new ArrayList<Point>() ;
      for(int i =0 ; i<n ;i++)
      {
        double x = Double.parseDouble(next()) ;
        double y = Double.parseDouble(next()) ;
        Point p = new Point(x,y) ;
        ar.add(p) ;
      }
      double low = 0 ;
      double high = 10000 ;
      for(int i =0  ;i<20 ; i++)
      {
        double mid = (low+high)/2 ;
        if(check(ar,mid)>=m)
        {
          high = mid ;
        }
        else
        {
          low = mid ;
        }
      }
      println(low) ;
    }
    public static int check(ArrayList<Point> ar,double r)
    {
      int n = ar.size();
      int ans = 0 ;
      for(int i =0 ; i<n ; i++)
      {
        ArrayList<Point> temp = new ArrayList<Point>() ;
//        println(ar.get(i)) ;
        double x = ar.get(i).x ;
        double y = ar.get(i).y ;
        for(int j =0 ; j<n ; j++)
        {
          if(j!=i)
          {
            temp.add(new Point(ar.get(j).x-x,ar.get(j).y-y)) ;
          }
        }
        ans = Math.max(calc(temp,r),ans) ;
      }
      return ans ;
    }
    static int calc(ArrayList<Point> p,double r)
    {
      int n = p.size() ;
      double [] ang = new double[n] ;
      for(int i = 0 ; i<n ; i++)
      {
        ang[i] = angle(p.get(i).x,p.get(i).y) ;
      }
      ArrayList<Double> start = new ArrayList<Double>() ;
      ArrayList<Double> end = new ArrayList<Double>() ;
      int count = 0 ;
      for(int i =0 ; i<n ;i++)
      {
        double x = p.get(i).x ;
        double y = p.get(i).y ;
        if(x==0&&y==0)
        {
          count++ ;
          continue ;
        }
        if(x*x+y*y>4*r*r)
        {
          continue ;
        }
        double d = Math.sqrt(x*x+y*y);
        double phi = Math.acos(d/(2*r)) ;
        if(ang[i]-phi>0)
        {
          start.add(ang[i]-phi) ;
        }
        else
        {
          start.add(ang[i]-phi+2*pi) ;
        }
        if(ang[i]+phi<2*pi)
        {
          end.add(ang[i]+phi) ;
        }
        else
        {
          end.add(ang[i]+phi-2*pi) ;
        }
      }
//      println(r+" "+start+" "+end) ;
//      println(count(start,end)) ;
      return count+count(start,end)+1 ;
    }
    static int count(ArrayList<Double> start,ArrayList<Double> end)
    {
      int n = start.size()+end.size();
      double [][] time = new double[n][2] ;
      int ctr = 0 ;
      for(int i = 0 ; i<(n/2); i++)
      {
        time[ctr][0] = start.get(i) ;
        time[ctr][1] = 2*i ;
        ctr++ ;
        time[ctr][0] = end.get(i) ;
        time[ctr][1] = 2*i+1 ;
        ctr++ ;
      }
      java.util.Arrays.sort(time, new java.util.Comparator<double[]>() {
          public int compare(double[] a, double[] b) {
            return (a[0] < b[0] ? -1 : (a[0] == b[0] ? 0 : 1));
          }
        });
      int max = 0 ;
      int cum = 0 ;
      int [] freq =  new int[n/2] ;
      for(int i =0 ; i<(2*n) ; i++)
      {
        int iv = (int) (time[i%n][1]/2) ;
        if(time[i%n][1]%2==1)
        {
           if(freq[iv]==1)
           {
             freq[iv] = 0 ;
             cum-- ;
           }
        }
        else
        {
          freq[iv] = 1 ;
          cum++ ;
        }
//        println("*"+started.size()) ;
        max = Math.max(max,cum) ;
      }
      return max ;
    }
    static double angle(double x,double y)
    {
      if(x==0)
      {
        if(y>0)
        {
          return pi/2 ;
        }
        else
        {
          return 3*pi/2 ;
        }
      }
      if(y==0)
      {
        if(x>0)
        {
          return 0 ;
        }
        else
        {
          return pi ;
        }
      }
      if(x>0&&y>0)
      {
        return Math.atan(y/x) ;
      }
      if(x<0&&y>0)
      {
        return pi-Math.atan(-y/x) ;
      }
      if(x<0&&y<0)
      {
        return pi+Math.atan(y/x) ;
      }
      if(x>0&&y<0)
      {
        return 2*pi-Math.atan(-y/x) ;
      }
      return 0 ;
    }
    static class Point
    {
      double x,y ;
      Point(double x,double y)
      {
        this.x = x ;
        this.y = y ;
      }
      public String toString()
      {
        return Double.toString(x)+" "+Double.toString(y) ;
      }
    }
}