
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    String[] inWords = {"the", "this", "that"};

    while ((readStr = reader.readLine()) != null) {
      //まず暗号化された文字列を配列にしてforで回す
      String[] cryptedWords = readStr.split(" ");
      int m = 0;
      a:
      for (String cryptedWord : cryptedWords) {
        //次に必ず含まれているワードをforで回す
        for (String inWord : inWords) {
          //同じ文字列の長さの場合
          if (inWord.length() == cryptedWord.length()) {
            //適当に文字コードを減算していく。
            char[] wordChars = cryptedWord.toCharArray();
            for (int i = 0; i < 30; i++) {
              for (int j = 0; j < wordChars.length; j++) {
                wordChars[j] = (char) (wordChars[j] - 1);
                if (wordChars[j] < 'a')
                  continue a;
              }
              if (new String(wordChars).equals(inWord)) {
                m = i;
                break a;
              }
            }
          }
        }
      }

      String result = "";
      for (String cryptedWord : cryptedWords) {
        char[] cryptedWordChars = cryptedWord.toCharArray();
        for (int i = 0; i < cryptedWordChars.length; i++) {
          if (cryptedWordChars[i] != '.')
            cryptedWordChars[i] = (char) (cryptedWordChars[i] - m - 1);
        }
        result = result.concat(new String(cryptedWordChars)) + " ";
      }
      System.out.println(result.substring(0, result.length()-1));

    }

  }

}