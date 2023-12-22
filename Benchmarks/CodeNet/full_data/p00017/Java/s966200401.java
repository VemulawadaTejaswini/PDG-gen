
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    while ((in = reader.readLine()) != null) {

      int diffA = 1;
      int diffB = -1;
      boolean toggle = false;
      while (true) {
        String str = getDisplaceStr(in, toggle ? diffA : diffB);
        if (str.contains("the") || str.contains("this") || str.contains("that")) {
          System.out.println(str);
          break;
        } else {
          if (toggle)
            diffA++;
          else
            diffB--;
        }
      }

    }
  }

  public static String getDisplaceStr(String in, int diff) {
    char[] cryptedChars = in.toCharArray();
    char[] decryptedChars = new char[cryptedChars.length];
    for (int i = 0; i < cryptedChars.length; i++) {
      Pattern p = Pattern.compile("[a-zA-Z]");
      if (p.matcher(String.valueOf(cryptedChars[i])).find()) {
        decryptedChars[i] = (char) (cryptedChars[i] - diff);
      } else {
        decryptedChars[i] = cryptedChars[i];
      }
    }
    return String.valueOf(decryptedChars);
  }

}