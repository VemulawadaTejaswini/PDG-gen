import java.util.Scanner;

class Main {

  private static String s;

  public static long rec(int i, String c) {
    if (i == s.length()) {
      long ans = 0;
      String[] nums = c.split(",", 0);
      for (String num : nums) {
        ans += Long.parseLong(num);
      }
      return ans;
    }
    return rec(i + 1, c + s.charAt(i)) + rec(i + 1, c + "," + s.charAt(i));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    s = sc.next();
    String c = String.valueOf(s.charAt(0));
    System.out.println(rec(1, c));
  }

}
