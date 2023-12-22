import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // 文字列の入力1
      String str1 = sc.nextLine();
      // 1行目の配列
      String[] strArray1 = str1.split(" ");
      // 上限時間
      int k = Integer.parseInt(strArray1[2]);

      // 文字列の入力2
      String str2 = sc.nextLine();
      // 2行目の配列
      String[] strArray2 = str2.split(" ");
      // 2行目のQueue
      Deque<Integer> que2 = new ArrayDeque<>();
      for(String s:strArray2) {
        que2.add(Integer.parseInt(s));
      }

      // 文字列の入力3
      String str3 = sc.nextLine();
      // 3行目の配列
      String[] strArray3 = str3.split(" ");
      // 3行目のQueue
      Deque<Integer> que3 = new ArrayDeque<>();
      for(String s:strArray3) {
        que3.add(Integer.parseInt(s));
      }

      // 冊数
      int count = 0;

      while(true){
        if(que2.peek() != null && que3.peek() != null) {
          if(que2.peek() <= k || que3.peek() <= k) {
            if(que2.peek() <= que3.peek()) {
              k -= que2.poll();
            }else {
              k -= que3.poll();
            }
            count++;
        }else {
          break;
        }
      }else if(que2.peek() == null && que3.peek() != null) {
        if(que3.peek() <= k) {
          k -= que3.poll();
          count++;
        }else {
          break;
        }
      }else if(que2.peek() != null && que3.peek() == null) {
        if(que2.peek() <= k) {
          k -= que2.poll();
          count++;
        }else {
          break;
        }
      }else {
        break;
      }
  }
      System.out.println(count);
  }
}