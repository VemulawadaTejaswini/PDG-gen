
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr = reader.readLine();
    System.out.println(reverse(readStr));
  }

  public static String reverse(String str) {
    char[] strChars = str.toCharArray();
    
    for (int i = 0; i < strChars.length / 2; i++) {
      char stack = strChars[i];
      strChars[i] = strChars[strChars.length-1-i];
      strChars[strChars.length-1-i] = stack;
    }
    return new String(strChars);
  }
  
}