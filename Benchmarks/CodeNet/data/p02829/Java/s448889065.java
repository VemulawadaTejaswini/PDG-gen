import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a = in.readLine();
    String b = in.readLine();
    String ans = "123";
    System.out.println((ans.replace(a,"")).replace(b,""));
  }
}