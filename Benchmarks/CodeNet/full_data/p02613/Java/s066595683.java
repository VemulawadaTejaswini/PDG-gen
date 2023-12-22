import java.util.*;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    int caseNum = scanner.nextInt();
    for (int i = 0; i < caseNum; i++) {
      String s = scanner.next();
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    for (String k : map.keySet()) {
      System.out.println(k + " x " + map.get(k));
    }
  }

  private static final Scanner scanner = new Scanner(System.in);
}
