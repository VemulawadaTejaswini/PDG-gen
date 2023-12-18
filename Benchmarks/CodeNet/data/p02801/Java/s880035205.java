import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String c = in.readLine();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int index = alphabet.indexOf(c);
    System.out.println(alphabet.charAt(index+1));
  }
}