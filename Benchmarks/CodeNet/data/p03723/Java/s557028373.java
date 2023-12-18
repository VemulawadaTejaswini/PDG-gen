import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long c = Long.parseLong(str[2]);
    int count = 0;
    boolean flg = false;
    for(long i=0; i<1000000000; i++) {
      if(a%2!=0 && b%2!=0 && c%2!=0) {
        System.out.println(count);
        return;
      }
      long ta = a/2;
      long tb = b/2;
      long tc = c/2;
      a = ta;
      b = tb;
      c = tc;
      count++;
    }
    System.out.println(-1);
  }
}