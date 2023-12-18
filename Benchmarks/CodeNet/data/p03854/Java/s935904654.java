import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    new Main();
  }
  public Main() {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      String rev = "";
      for (int i = S.length() - 1;i >= 0;-- i) {
        rev += S.charAt(i);
        switch(rev) {
          case "maerd":
          case "remaerd":
          case "esare":
          case "resare":
            rev = "";
        }
      }
      System.out.println(rev.isEmpty() ? "YES" : "NO");
    }
  }
}
