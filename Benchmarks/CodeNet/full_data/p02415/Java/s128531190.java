import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String strText = input.readLine();
    StringBuffer sb = new StringBuffer();

    for (int index = 0; index < strText.length(); index++) {
      // 小文字の場合
      if(Character.isLowerCase(strText.charAt(index))) {
        sb.append(Character.toUpperCase(strText.charAt(index)));
      // 大文字の場合
      } else if (Character.isUpperCase(strText.charAt(index))) {
        sb.append(Character.toLowerCase(strText.charAt(index)));
      } else {
        sb.append(strText.charAt(index));
      }
    }
    System.out.println(sb.toString());
  }

}
