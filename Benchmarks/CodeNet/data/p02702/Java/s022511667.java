import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int result = 0;
    for (int i=0; i<s.length()-3; i++) {
      for (int j=i+4; j<=s.length(); j++) {
        String sb = s.substring(i, j);
        if (isMultiple(sb)) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
  static boolean isMultiple(String s) {
    int temp = 0;
    for (int i=0; i<s.length(); i++) {
      temp = (temp* 10 +Character.getNumericValue(s.charAt(i)))% 2019;
    }
    return temp == 0;
  }
}
