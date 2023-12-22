import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    List<Map<String, Integer>> queue = new ArrayList<>();
    int second = 0;
    for(int i = 0; i < n; i++) {
        queue.add(new HashMap<>());
        queue.get(queue.size() - 1).put(sc.next(), sc.nextInt());
    }
    while(queue.size() > 0) {
      String s = "";
      for(String e : queue.get(0).keySet()) {
        s = e;
      }
      int a = queue.get(0).get(s);
      queue.remove(0);
      if(a <= q) {
        second += a;
        System.out.println(s + " " + second);
      } else {
        second += q;
        queue.add(new HashMap<>());
        queue.get(queue.size() - 1).put(s, a - q);
      }
    }
  }
}

