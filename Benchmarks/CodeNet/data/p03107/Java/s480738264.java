import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String s = sc.next();
      int n = s.length();
      Deque<Integer> st = new ArrayDeque<Integer>();

      for (int i = 0; i < n; i++) {
        int c = s.charAt(i);
        if (st.isEmpty() || st.peek() == c) {
          st.push(c);
        } else {
          st.pop();
        }
      }
      System.out.println(n - st.size());
    } finally {
      sc.close();
    }
  }
}