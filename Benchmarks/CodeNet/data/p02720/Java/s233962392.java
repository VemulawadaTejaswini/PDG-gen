import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        // que: 七五三数(候補) (全ての桁が7 or 5 or 3)
        Queue<Long> que = new ArrayDeque<Long>();
        
        // 3, 5, 7からBFSスタート
        // (後ろの3項は、1なら3,5,7が既に登場)
        for (long i = 1; i <= 9; i++) {
            que.add(i);
        }
        
        // count: n以下の七五三数の個数
        // -> 全ての桁が7 or 5 or 3かつ、7,5,3全て登場する数
        // ex. 753, 3577735, 533333337
        int count = 0;
        while (!que.isEmpty()) {
            long num = que.poll();
            // System.out.println(num);
            count++;
            if (count == n) {
                System.out.println(num);
                return;
            }
            
            long x10 = num * 10;
            long last = num % 10;
            
            // 次の桁のパターンをキューに入れる x10+3, x10+5, x10+7
            if (last >= 1) que.add(x10 + last - 1);
            que.add(x10 + last);
            if (last < 9) que.add(x10 + last + 1);
        }
    }
}