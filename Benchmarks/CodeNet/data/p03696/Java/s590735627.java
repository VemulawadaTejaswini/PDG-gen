import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      Deque<Character> queue = new LinkedList<>();
      int openCnt = 0;
      for(char c : s.toCharArray()) {
        if(c == '(') {
          openCnt++;
          queue.offer(c);
        } else {
          if(openCnt > 0) {
            openCnt--;
            queue.offer(c);
          } else {
            queue.addFirst('(');
            queue.offer(c);
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      while(!queue.isEmpty()) {
        char c = queue.pop();
        sb.append(c);
      }
      while(openCnt-- > 0) {
          sb.append(')');
      }
      System.out.println(sb.toString());
  }
}