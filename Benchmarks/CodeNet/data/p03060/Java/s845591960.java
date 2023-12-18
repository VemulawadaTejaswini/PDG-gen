import java.io.*;
import java.util.*;

class Resale {
  public static void main(String[] args) {
    BufferedReader f = new BufferedReader(System.in);
    PrintWriter out = new PrintWriter(new BufferedWriter(System.out));
    
    int a = Integer.parseInt(f.readLine());
    StringTokenizer vals = new StringTokenizer(f.readLine());
    StringTokenizer costs = new StringTokenizer(f.readLine());
    
    String val;
    String cost;
    int profit = 0;
    
    for (int i = 0; i < a; i++) {
      val = vals.nextToken();
      cost = costs.nextToken();
      if (val > cost) {
        profit += val - cost;
      }
    }
    
    out.write(profit);
    out.close();
  }
}
