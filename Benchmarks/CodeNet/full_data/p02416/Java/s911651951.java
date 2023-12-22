import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    int sum = 0;
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String input = reader.readLine();
      
      for (int i = 0; i < input.length(); i++) {
        sum += input.charAt(i) - '0';
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println(sum);
  }
}