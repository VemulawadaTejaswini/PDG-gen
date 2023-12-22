import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int x = Integer.parseInt(input);
    double r = Math.pow(x, 3);
    System.out.println(r);
  }
}