import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);
    int b = Integer.parseInt(str[2]);
    int quo = n/(a+b);
    int rem = n%(a+b);
    //System.out.println(quo + " " + rem);
    if(rem>a)
      System.out.println(quo*a + a);
    else
      System.out.println(quo*a + rem);
  }
}