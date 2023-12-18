/** Simple yet moderately fast I/O routines.
 *
 * Example usage:
 *
 * Kattio io = new Kattio(System.in, System.out);
 *
 * while (io.hasMoreTokens()) {
 *    int n = io.getInt();
 *    double d = io.getDouble();
 *    double ans = d*n;
 *
 *    io.println("Answer: " + ans);
 * }
 *
 * io.close();
 *
 *
 * Some notes:
 *
 * - When done, you should always do io.close() or io.flush() on the
 *   Kattio-instance, otherwise, you may lose output.
 *
 * - The getInt(), getDouble(), and getLong() methods will throw an
 *   exception if there is no more data in the input, so it is generally
 *   a good idea to use hasMoreTokens() to check for end-of-file.
 *
 * @author: Kattis
 */

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;

class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}
public class Main {
  public static class peak {
    public int max;
    public int min;
    public peak(){
      max=1000000000;
      min=1;
    }
    public int range(){
      return Math.max(0,max-min+1);
    }
  }
  public static void main (String args[]) {
    Kattio sc = new Kattio(System.in);
    int n=sc.getInt();
    peak[] peaks = new peak[n];
    for (int i =0; i<n; i++) {
      peaks[i]=new peak();
    }
    int m = 0;
    for (int i = 0; i<n; i++) {
      int c = sc.getInt();
      if (c>m) {
        m=c;
        peaks[i].max=Math.min(c,peaks[i].max);
        peaks[i].min=Math.max(c,peaks[i].min);
      }
      else {
        peaks[i].max=Math.min(c,peaks[i].max);
      }
    }
    m=0;
    int[] a = new int[n];
    for (int i = 0; i<n; i++) {
      a[i]=sc.getInt();
    }
    for (int i = n-1; i>=0; i--) {
      int c = a[i];
      if (c>m) {
        m=c;
        peaks[i].max=Math.min(c,peaks[i].max);
        peaks[i].min=Math.max(c,peaks[i].min);
      }
      else {
        peaks[i].max=Math.min(c,peaks[i].max);
      }
    }
    long prod =1;
    for (int i = 0; i<n;i++) {
      prod*=peaks[i].range();
      prod=prod%1000000007;
    }
    System.out.println(prod);
  }
}
