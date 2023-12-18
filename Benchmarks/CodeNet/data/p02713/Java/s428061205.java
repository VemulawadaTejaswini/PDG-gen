import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    
    long sum = 0L;
    for (int i = 1; i <= k; i++)
      for (int j = 1; j <= k; j++) {
        int g = gcd(i, j);
        for (int s = 1; s <= k; s++)
          sum += gcd(g, s);
      }
    
    System.out.print(sum);
  }
  
  private static int gcd(int a, int b) {
  	while (b != 0) {
      int t = b;
      b = a % b;
      a = t;
    }
    
    return a;
  }
}
