
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    // 前からだと分解できるかわからないので、後ろから分解してみる
    String[] divideArr = {"maerd", "remaerd", "esare", "resare"};
    char[] c = S.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = c.length - 1; i >= 0; i--) {
      sb.append(c[i]);
    }
    String reverseStr = sb.toString();


    for (int i = 0; i < reverseStr.length();) {
      boolean isDivided = false;
      for (String s : divideArr) {
        // ぶんかいできたら、分解した次の文字から繰り返す
        if (reverseStr.substring(i).startsWith(s)) {
          i += s.length();
          isDivided = true;
          break;
        }
      }
      if (!isDivided) {
        System.out.println("NO"); // 分解できなかったらおわり
        return;
      }
    }

    System.out.println("YES");
  }
}
