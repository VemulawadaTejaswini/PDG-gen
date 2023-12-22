import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final String s = sc.next();
    final String t = sc.next();
    int count = 0;
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) != t.charAt(i))
        ++count;
    }
  	System.out.println(count);
  }
}