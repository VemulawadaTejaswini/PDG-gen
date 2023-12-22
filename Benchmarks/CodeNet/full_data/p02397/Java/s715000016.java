import java.io.*;
import java.util.Arrays;
    
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    while (!(input = br.readLine()).equals("0 0")) {
      String[] inputs = input.split(" ");
      Arrays.sort(inputs);
      System.out.println(String.join(" ", inputs));
    }
  }
}