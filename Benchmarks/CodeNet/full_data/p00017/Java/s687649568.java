
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
            //適当に文字コードを加算・減算していく。
            char[] wordChars = cryptedWord.toCharArray();
            for (int i = -100; i < 100; i++) {
              char[] wordCharsChanged = new char[wordChars.length];
              for (int j = 0; j < wordCharsChanged.length; j++) {
                wordCharsChanged[j] = (char) ('a' + (wordChars[j] + i % ('z' - 'a')));
              }
              if (new String(wordCharsChanged).equals(inWord)) {
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
          if (cryptedWordChars[i] != '.' && cryptedWordChars[i] != ' ')
            cryptedWordChars[i] = (char) (cryptedWordChars[i] + m);
        }
        result = result.concat(new String(cryptedWordChars)) + " ";
      }
      System.out.println(result.substring(0, result.length()-1));

    }

  }

}