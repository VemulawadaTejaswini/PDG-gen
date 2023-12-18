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

  public long getMoves(long a, long b) {
    long left=Math.min(a,b);
    long right=Math.max(a,b);
    long cnt=0;

    long firstSetOfMoves=left-1;
    left-=firstSetOfMoves;
    right-=firstSetOfMoves;
    cnt+=firstSetOfMoves;

    cnt+=1;
    right-=1;

    if(right!=left) {
      cnt+=((right-left)/2);
    }

    return cnt;
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1;
      long n,a,b;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Long.parseLong(token[0]);
      a=Long.parseLong(token[1]);
      b=Long.parseLong(token[2]);

      if(Math.abs(a-b)%2==0) {
        out.println(Math.abs(a-b)/2);
      }
      else {
        out.println(Math.min(getMoves(a, b), getMoves(n-a+1, n-b+1)));
      }

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
