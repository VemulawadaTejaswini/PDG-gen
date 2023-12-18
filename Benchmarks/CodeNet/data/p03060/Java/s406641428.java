import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    int a = Integer.parseInt(f.readLine());
    StringTokenizer vals = new StringTokenizer(f.readLine());
    StringTokenizer costs = new StringTokenizer(f.readLine());
    
    int val;
    int cost;
    int profit = 0;
    
    for (int i = 0; i < a; i++) {
      val = Integer.parseInt(vals.nextToken());
      cost = Integer.parseInt(costs.nextToken());
      if (val > cost) {
        profit += val - cost;
      }
    }
    
    out.write(String.valueOf(profit));
    out.close();
  }
}
