import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[3];
    for(int i=0; i<3; i++) {
      str = in.readLine().split("");
      System.out.print(str[i]);
    }
  }
}