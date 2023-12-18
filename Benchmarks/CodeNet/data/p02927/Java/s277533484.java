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

      int t,x1,M,D,i,j,d1,d10,productDays;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      M=Integer.parseInt(token[0]);
      D=Integer.parseInt(token[1]);

      productDays=0;

      for(i=1;i<=M;i++) {
        for(j=1;j<=D;j++) {
          d1=j%10;
          d10=j/10;
          if(d1>=2 && d10>=2 && d1*d10==i) {
            productDays++;
          }
        }
      }

      out.println(productDays);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
