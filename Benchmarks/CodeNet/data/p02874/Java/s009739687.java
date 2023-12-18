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

  public static int rangeReduction(int l, int r, int i, int j) {
    if(i < l) {
      if(j < l) {
        return (r - l + 1);
      }
      else if(j >= l && j <= r){
        return (r - j);
      }
      else {
        return 0;
      }
    }
    else if(i >= l && i <= r) {
      if(j <= r) {
        return (r - l + 1) - (j - i + 1);
      }
      else {
        return (i - l);
      }
    }
    else {
      return (r - l + 1);
    }
  }
 
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

      int t,x1,n,i;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);

      int[][] range=new int[n][2];

      for(i=0;i<n;i++) {
        str=in.readLine().trim();
        token=str.split(" ");
        range[i][0]=Integer.parseInt(token[0]);
        range[i][1]=Integer.parseInt(token[1]);
      }

      Arrays.sort(range, new Comparator<int[]>() {
        public int compare(int[] c1,int[] c2)
        {
          int t1=c1[0]-c2[0];
          if(t1 != 0)
            return t1;
          int t2=c1[1]-c2[1];
            return t2;
        }
      });

      int l1=range[0][0];
      int r1=range[0][1];
      int l2=range[n-1][0];
      int r2=range[n-1][1];

      for(i=1;i<n-1;i++) {
        int reductionInCluster1 = rangeReduction(l1, r1, range[i][0], range[i][1]);
        int reductionInCluster2 = rangeReduction(l2, r2, range[i][0], range[i][1]);
        if(reductionInCluster1 <= reductionInCluster2) {
          l1=Math.max(l1, range[i][0]);
          r1=Math.min(r1, range[i][1]);
        }
        else {
          l2=Math.max(l2, range[i][0]);
          r2=Math.min(r2, range[i][1]);
        }
      }

      out.println(Math.max(r1-l1+1,0)+Math.max(r2-l2+1,0));

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
