import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strArray;
    int a , b;
    String op;
    String line;
    StringBuilder output = new StringBuilder();
    while (true) {
      line = br.readLine();
      strArray = line.split(" ");
      op = strArray[1];
      a = Integer.parseInt(strArray[0]);
      b = Integer.parseInt(strArray[2]);
      if (op.equals("+")) {
        output.append(Integer.toString(a + b)).append("\n");
      }
      else if (op.equals("-")) {
        output.append(Integer.toString(a - b)).append("\n");
      }
      else if (op.equals("*")) {
        output.append(Integer.toString(a * b)).append("\n");
      }
      else if (op.equals("/")) {
        output.append(Integer.toString(a / b)).append("\n");
      }
      else if (op.equals("?")) {
        break;
      }
    }
    System.out.print(output);
  }
}