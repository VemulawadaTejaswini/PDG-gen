import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader in = new BufferedReader(
                       new InputStreamReader(System.in));
    int a1 = Integer.parseInt(in.readLine());
    int a2 = Integer.parseInt(in.readLine());

    int b=a1*a2;
    int b1=(a1*2)+(a2*2);
    System.out.println(b+" "+b1);
  }
}