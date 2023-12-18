import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  
  public static long gcd(int a,int b) {
    return b == 0?a:gcd(b,a%b);
  }
  
  public static long lcm(int a,int b) {
    return a/gcd(a,b)*b;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    System.out.println(lcm(a,b));
  }
}