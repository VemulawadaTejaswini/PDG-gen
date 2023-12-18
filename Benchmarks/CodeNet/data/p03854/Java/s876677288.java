
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    // 前からだと分解できるかわからないので、後ろから分解してみる
    String[] divideArr = {"maerd", "remaerd", "esare", "resare"};
    StringBuilder sb = new StringBuilder(sc.next()).reverse();
    String reverseStr = sb.toString();

    for (int i = 0; i < reverseStr.length();) {
      boolean isDivided = false;
      for (String s : divideArr) {
        // ぶんかいできたら、分解した次の文字から繰り返す
        String tmp = reverseStr.substring(i);
        if (tmp.startsWith(s)) {
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
