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

      int t,x1,n,i,j,MOD=1000000007;
      long k;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);
      k=Long.parseLong(token[1]);

      str=in.readLine().trim();
      token=str.split(" ");

      int[] a=new int[n];
      int[] full=new int[n];
      int[] nextOnly=new int[n];

      for(i=0;i<n;i++) {
        a[i]=Integer.parseInt(token[i]);
      }

      for(i=0;i<n;i++) {
        for(j=i+1;j<n;j++) {
          if(a[i]>a[j]) {
            nextOnly[i]++;
          }
        }

        for(j=0;j<n;j++) {
          if(a[i]>a[j]) {
            full[i]++;
          }
        }
      }

      long total=0L;
      long nc2=((k-1L)*k)/2;
      for(i=0;i<n;i++) {
        total+=((k*nextOnly[i])%MOD);
        total%=MOD;
        total+=((nc2*full[i])%MOD);
        total%=MOD;
      }

      out.println(total);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
