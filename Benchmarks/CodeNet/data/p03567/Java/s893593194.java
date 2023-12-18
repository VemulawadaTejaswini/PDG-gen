import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "No";
    for(int i = 0; i < s.length() - 1; i++) {
      String str = s.substring(i, i + 2);
      if(s.equals("AC")) ans = "Yes";
    }
    System.out.println(ans);
  }
}