import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    
    Set<String> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        String substring = s.substring(i, j+1);
        if (substring.length() <= 5) {
          set.add(substring);
        }
      }
    }
    List<String> list = new ArrayList<>();
    list.addAll(set);
    Collections.sort(list);
    System.out.println(list.get(K-1));
  }
}