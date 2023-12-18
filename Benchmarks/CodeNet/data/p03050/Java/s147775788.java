import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    long n = Long.parseLong(line);
    System.err.println(n);

    if (n == 3) {
      System.out.println(2);
      return;
    }
    
    long sum = 0;
    for (int i=(int)Math.sqrt(n); i < n; i++) {
      long div = n / i;
      long mod = n % i;
      if (div == mod) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}