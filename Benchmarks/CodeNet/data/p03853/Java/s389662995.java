import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int h = Integer.parseInt(str[0]);
    int w = Integer.parseInt(str[1]);
    String st = "";
    for(int i=0; i<h; i++) {
      st = in.readLine();
      System.out.println(st);
      System.out.println(st);
    }
  }
}