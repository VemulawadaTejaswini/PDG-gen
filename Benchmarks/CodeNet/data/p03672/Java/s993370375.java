import java.util.*;


public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();

  isOddString(s.substring(0, s.length() - 1));
  }

  public static void isOddString(String s) {
  if (s.length() % 2 != 0) {
    isOddString(s.substring(0, s.length() - 1));
  }
  if (s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2, s.length()))) {
    System.out.println(s.length());
    System.exit(0);
  } else {
    isOddString(s.substring(0, s.length() - 1));
  }
  }
}
