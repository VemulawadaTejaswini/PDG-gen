import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long ans = 0;
    boolean flg = true;
    for(int i=2; i<=a; i++) {
      if(a%i==0 && b%i==0){
        ans = a*b/i;
        a = a/i;
        flg = false;
      }
    }
    System.out.println(flg==false?ans:a*b);
  }
}