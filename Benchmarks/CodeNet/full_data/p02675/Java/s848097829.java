import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = s.substring(s.length() - 1, s.length());
    int i = Integer.parseInt(t);
    String ans = null;
    if (i == 3) {
      ans = "bon";
    } else if (i == 0 || i == 1 || i == 6 || i == 8) {
      ans = "pon";
    } else {
      ans = "hon";
    }
    System.out.println(ans);
  }
}
