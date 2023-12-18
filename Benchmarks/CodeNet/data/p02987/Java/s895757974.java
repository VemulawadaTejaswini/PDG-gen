import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < 4; i++) {
      char c = S.charAt(i);
      int count = map.getOrDefault(c, 0);
      map.put(c, ++count) ;
    }
    if (map.size() != 2) {
      System.out.println("No");
      return;
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() != 2) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }  
}