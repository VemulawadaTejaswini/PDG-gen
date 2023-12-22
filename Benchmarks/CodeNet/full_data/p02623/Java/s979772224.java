package practice;

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
      Long k = Long.parseLong(strArray1[2]);

      // 文字列の入力2
      String str2 = sc.nextLine();
      // 2行目の配列
      String[] strArray2 = str2.split(" ");
      // 2行目のQueue
      Deque<Long> que2 = new ArrayDeque<>();
      for(String s:strArray2) {
        que2.add(Long.parseLong(s));
      }

      // 文字列の入力3
      String str3 = sc.nextLine();
      // 3行目の配列
      String[] strArray3 = str3.split(" ");
      // 3行目のQueue
      Deque<Long> que3 = new ArrayDeque<>();
      for(String s:strArray3) {
        que3.add(Long.parseLong(s));
      }

      // 冊数
      int count = 0;

      // 各机の上から読める本の数
      long l2cnt = 0;
      long l3cnt = 0;

      while(true){
        if(que2.peek() != null && que3.peek() != null) {
          // 両方あり

          // 総和の計算
            Long[] longArray2 = que2.toArray(new Long[0]);
            long l2sum = 0;
            for(Long l:longArray2) {
              if(l2sum + l <= k) {
                l2sum += l;
                l2cnt++;
              }else {
                break;
              }
            }
            Long[] longArray3 = que3.toArray(new Long[0]);
            long l3sum = 0;
            for(Long l:longArray3) {
              if(l3sum + l <= k) {
                l3sum += l;
                l3cnt++;
              }else {
                break;
              }
            }

          if(l2cnt == l3cnt) {
            // 読める冊数が同じ場合は時間が少ない本を読む
            if(que2.peek() <= que3.peek()) {
              if(que2.peek() <= k) {
                k -= que2.poll();
                l2cnt = 0;
                l3cnt = 0;
                count++;
              }else {
                break;
              }
            }else {
              if(que3.peek() <= k) {
                k -= que3.poll();
                l2cnt = 0;
                l3cnt = 0;
                count++;
              }else {
                break;
              }
            }
          }else if(l2cnt > l3cnt) {
            // 2の方が読める冊数が多い場合
            if(que2.peek() <= k) {
              k -= que2.poll();
              l2cnt--;
              count++;
            }else {
              break;
            }
          }else {
            if(que3.peek() <= k) {
              // 3の方が読める冊数が多い場合
              k -= que3.poll();
              l3cnt--;
              count++;
            }else {
              break;
            }
          }
      }else if(que2.peek() == null && que3.peek() != null) {
        // 3のみに本あり
        if(que3.peek() <= k) {
          k -= que3.poll();
          count++;
        }else {
          break;
        }
      }else if(que2.peek() != null && que3.peek() == null) {
        // 2のみに本あり
        if(que2.peek() <= k) {
          k -= que2.poll();
          count++;
        }else {
          break;
        }
      }else {
        // 読める本なし
        break;
      }
  }
      System.out.println(count);
  }
}