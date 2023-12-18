import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  static BufferedReader in;
  static PrintWriter out;
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,i,j;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);

      str=in.readLine().trim();
      token=str.split(" ");

      Double[] a=new Double[n];

      for(i=0;i<n;i++) {
        a[i]=Double.parseDouble(token[i]);
      }

      Arrays.sort(a);

      long sum=0L;

      for(i=0;i<n;i++) {
        for(j=i+1;j<n;j++) {
          int pos=Arrays.binarySearch(a,a[i]+a[j]-0.5);
          pos=-1*pos-1;
          sum+=(pos-j)-1;
        }
      }

      out.println(sum);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
