import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      char[] str = reader.readLine().toCharArray();

      for (int i = 0; i < str.length; i++) {
        if (Character.isUpperCase(str[i])) {
          System.out.print(Character.toLowerCase(str[i]));
        }
        else if (Character.isLowerCase(str[i])) {
          System.out.print(Character.toUpperCase(str[i]));
        }
        else {
          System.out.print(str[i]);
        }
      }
      System.out.println();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}