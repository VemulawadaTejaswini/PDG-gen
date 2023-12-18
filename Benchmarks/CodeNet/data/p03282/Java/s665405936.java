import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();
    int cnt = 0;
    int i = 0;
    while ((S.charAt(i) == '1')) {
      cnt++;
      i++;
    }
    if (K <= cnt) {
      System.out.println(1);
    } else {
      System.out.println(S.charAt(cnt));
    }
  }
}
