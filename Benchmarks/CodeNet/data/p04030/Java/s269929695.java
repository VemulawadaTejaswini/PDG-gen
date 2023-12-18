import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    sc.close();

    String[] S = s.split("");
    
    Deque<String> deque = new ArrayDeque<>();

    for (int i = 0; i < S.length; i++) {
      if (S[i].equals("0")) {
        deque.push("0");
      }
      if (S[i].equals("1")) {
        deque.push("1");
      }
      if (S[i].equals("B")) {
        if (0 < deque.size()) {
          deque.pop();
        }
      }
    }

    int l = deque.size();

    for (int i = 0; i < l; i++) {
      System.out.print(deque.poll());
    }

    System.out.println("");

  }

}