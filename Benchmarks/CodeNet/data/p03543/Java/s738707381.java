import java.util.*;
public class Main {
  public static void main  (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	String str = String.valueOf(n);
    int cnt = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        cnt++;
      }
      else {
        cnt = 0;
      }
      if (cnt >= 2) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}