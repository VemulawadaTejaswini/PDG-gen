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


  public int findDigitsInBase(long n, int base) 
  { 
      return (int)(Math.floor(Math.log(n)/Math.log(base)) + 1);  
  } 
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,p,i;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);

      str=in.readLine().trim();
      token=str.split(" ");

      Integer[] a=new Integer[n];

      for(i=0;i<n;i++) {
        a[i]=Integer.parseInt(token[i]);
      }

      Arrays.sort(a);

      int min=Integer.MAX_VALUE;

      for(p=1;p<=100;p++) {
        int stamina=0;
        for(i=0;i<n;i++) {
          stamina+=(Math.abs(p-a[i])*Math.abs(p-a[i]));
        }
        min=Math.min(min, stamina);
      }

      out.println(min);


      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
