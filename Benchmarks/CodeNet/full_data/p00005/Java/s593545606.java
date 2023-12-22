import java.awt.Frame;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.print.attribute.standard.Chromaticity;
import javax.sql.rowset.FilteredRowSet;
import javax.swing.BorderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.events.EndDocument;
import javax.xml.transform.Templates;

import java.math.BigInteger;
import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Main {
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        out.println(gcd(x, y) + " " + lcm(x, y));
      }
//      End solve()
    }
    
    int gcd(int x, int y) {
      if (x < y) {
        int tmp = x;
        x = y;
        y = tmp;
      }
   
      while (y > 0) {
        int r = x % y;
        x = y;
        y = r;
      }
      return x;
    }
    
    long lcm(int x, int y) {
      if (x == 0 || y == 0) {
        return 0;
      }
      long lcm = x *( y / gcd(x, y));
      
      return lcm;
    }
//  End solution
  } 
  

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;
    
    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }
   
    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }
    
    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken()); 
    }
    
    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }
    
    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }
    
  }
  
}