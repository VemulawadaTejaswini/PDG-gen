import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    Deque<Integer> queue = new ArrayDeque<>();
    for(int i = 0; i < n; i++) {
      if(i % 2 == 0) queue.addFirst(Integer.parseInt(sc.next()));
      else queue.addLast(Integer.parseInt(sc.next()));
    }
    StringBuilder sb = new StringBuilder();
    if(n % 2 == 1) {
      for(int i = 0; i < n; i++) {
        sb.append(queue.pollFirst());
        sb.append(" ");
      }
    } else {
      for(int i = 0; i < n; i++) {
        sb.append(queue.pollLast());
        sb.append(" ");
      }
    }
    System.out.println(sb.toString());
  }
}
