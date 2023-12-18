import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    // 辞書順で s′ < t′となるようにできるか。
    // 辞書順が最も小さいs'と辞書順が最も大きいt'を比べる
    char[] sArr = s.toCharArray();
    Arrays.sort(sArr);
    String sDash = String.valueOf(sArr);
    char[] tArr = t.toCharArray();
    Arrays.sort(tArr);
    StringBuilder sb = new StringBuilder(t);
    String tDash = sb.reverse().toString();

    System.out.println(sDash.compareTo(tDash) < 0 ? "Yes" : "No");
  }
}