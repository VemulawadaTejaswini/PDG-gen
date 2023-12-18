import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // que1: 負の数を正の数にしたキュー
        // que2: 正の数の入ったキュー
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < 0) {
                que1.add(num * -1);
            } else {
                que2.add(num);
            }
        }
        
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < k; i++) {
            if (que1.isEmpty()) {
                max2 = que2.poll();
                continue;
            }
            if (que2.isEmpty()) {
                max1 = que1.poll();
                continue;
            }
            
            int num1 = que1.peek();
            int num2 = que2.peek();
            
            if (num1 == num2) {
                if (max1 < max2) {
                    max2 = que2.poll();
                } else {
                    max1 = que1.poll();
                }
            } else if (num1 < num2) {
                max1 = que1.poll();
            } else {
                max2 = que2.poll();
            }
        }
        
        int ans = 0;
        if (max1 < max2) {
            ans = max1 * 2 + max2;
        } else {
            ans = max2 * 2 + max1;
        }
        System.out.println(ans);
    }
}