import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    if(a+b>a-b && a+b>a*b)
      System.out.println(a+b);
    else if(a-b>a+b && a-b>a*b)
      System.out.println(a-b);
    else
      System.out.println(a*b);
  }
}