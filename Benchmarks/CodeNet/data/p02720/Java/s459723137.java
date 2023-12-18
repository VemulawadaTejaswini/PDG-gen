import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      Queue<String> queue = new LinkedList<>();
      for(int i = 1; i <= 9; i++)
        queue.offer(i + "");
      for(int i = 1 ; i < k; i++) {
        String num = queue.poll();
        char lastChar = num.charAt(num.length() - 1);
        for(int j = -1; j <= 1; j++) {
          int lastNum = lastChar - '0' + j;
          if(lastNum < 0 || lastNum > 9) continue;
          queue.offer(num + lastNum);
        }
      }
      System.out.println(queue.peek());
  }
}