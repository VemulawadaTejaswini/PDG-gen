import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.StringBuilder;

public class Main {
  public static void main(String args[] ) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringBuilder sb = new StringBuilder(str);

    System.out.println(sb.reverse());
  }
}