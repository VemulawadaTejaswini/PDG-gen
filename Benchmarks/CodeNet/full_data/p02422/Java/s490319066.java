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
      StringBuilder str = new StringBuilder(in.next());
      int q = in.nextInt();
      
      for (int i = 0; i < q; i++) {
        String operation = in.next();
        int a = in.nextInt();
        int b = in.nextInt();
        
        switch (operation) {
          case "replace":
            String p = in.next();
            str.replace(a, b + 1, p);
            break;
          case "reverse":
            String tmp = new StringBuilder(str.substring(a, b+1)).reverse().toString();
            str.replace(a, b + 1, tmp);
            break;
          case "print":
            out.println(str.substring(a, b + 1));
            break;
          default:
            break;
        }
        
      }
      
//      End solve()
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