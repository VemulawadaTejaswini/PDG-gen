import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readValue;
    while ((readValue = reader.readLine()) != null) {
      int leftVal = Integer.parseInt(readValue.split(" ")[0]);
      String op = readValue.split(" ")[1];
      int rightVal = Integer.parseInt(readValue.split(" ")[2]);
      int result;
      if (op.equals("?"))
        break;
      switch (op) {
        case "+":
          result = leftVal + rightVal;
          break;
        case "-":
          result = leftVal - rightVal;
          break;
        case "*":
          result = leftVal * rightVal;
          break;
        case "/":
          result = leftVal / rightVal;
          break;
        default:
          result = Integer.MIN_VALUE;
          break;
      }
      System.out.println(result);
    }
  }

}