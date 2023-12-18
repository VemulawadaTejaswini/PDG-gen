
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    int n = sc.nextInt();

    Map<String, Integer> nmap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String keyword = sc.next();
      if (!nmap.containsKey(keyword)) {
        nmap.put(keyword, 1);
      } else {
        nmap.put(keyword, nmap.get(keyword) + 1);
      }
    }
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      String keyword = sc.next();
      if (!nmap.containsKey(keyword)) {
        nmap.put(keyword, -1);
      } else {
        nmap.put(keyword, nmap.get(keyword) - 1);
      }
    }

    int answer = 0;
    for (Map.Entry<String, Integer> entry : nmap.entrySet()) {
      answer = Math.max(entry.getValue(), answer);
    }
    System.out.println(answer);
  }
}
