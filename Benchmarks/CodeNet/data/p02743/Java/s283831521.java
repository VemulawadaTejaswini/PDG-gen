import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    long a = Integer.parseInt(data[0]);
    long b = Integer.parseInt(data[1]);
    long c = Integer.parseInt(data[2]);
    String result = firstDecimalSqrt(a) + firstDecimalSqrt(b) < firstDecimalSqrt(c) ? "Yes" : "No";
    
    System.out.println(result);
  }
  
  
  private static long longSqrt (long a) {
    long b = 2*(long)Math.sqrt(a);
    while (true){
      if (b*b >= 4*a && (b-1)*(b-1) >= 4*a){
        b--;
      } else if(b*b <= 4*a && (b+1)*(b+1) <= 4*a){
        b++;
      } else {
        break;
      }
    }
    return b;
  }
  
  private static double firstDecimalSqrt(long a){
    long b = (long)(10*Math.sqrt(a));
    while (true){
      if(b*b >= 100*a && (b-1)*(b-1) >= 100*a){
        b++;
      } else if (b*b <= 100*a && (b+1)*(b+1) <= 4*a){
        b++;
      } else {
        break;
      }
    }
    return b/10.0;
  }
}