import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int answer = eval(reader.readLine());
      System.out.println(answer);
    }
  }

  static int eval(String s) {
    int len = s.length();
    if (len == 1)
      return 0;
    return Math.min(diff(len, s, gen(false, len)), diff(len, s, gen(true, len)));
  }

  static char[] gen(boolean high, int length) {
    char[] chars = new char[length];
    for (int i = 0; i < length; ++i) {
      chars[i] = high ? '1' : '0';
      high = !high;
    }
    return chars;
  }

  static int diff(int length, String a, char[] b) {
    int diffs = 0;
    for (int i = 0; i < length; ++i) {
      if (a.charAt(i) != b[i])
        ++diffs;
    }
    return diffs;
  }


}
