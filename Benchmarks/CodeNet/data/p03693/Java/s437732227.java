import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "YES";
    int atc = Integer.parseInt(s.replaceAll(" ", ""));
    if (atc % 4 != 0)
      ans = "NO";
    System.out.println(ans);
  }
}