import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    List<Character> list = new ArrayList<>();
    list.add(c[0]);
    for (int i = 1; i < n; i++) {
      if (c[i - 1] != c[i]) {
        list.add(c[i]);
      }
    }
    System.out.println(list.size());
  }
}
