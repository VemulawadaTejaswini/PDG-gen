import java.io.*;
public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader());
    String[] s = reader.readLine().split(" ");
    int result = Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
    System.out.println(result);
  }
}