import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashSet<String> set = new HashSet<String>();
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      set.add(s);
    }
    System.out.println(set.size());
  }
}
