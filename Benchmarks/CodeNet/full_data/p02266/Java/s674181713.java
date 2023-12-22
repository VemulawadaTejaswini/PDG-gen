import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        
        Deque<Integer> downPos = new ArrayDeque<>();
        Deque<IntPair> downPosPool = new ArrayDeque<>();
        
        int totalPool = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '\\') {
                downPos.push(i);
            } else if (ch == '/' && !downPos.isEmpty()) {
                int j = downPos.pop();
                int a = i - j;
                totalPool += a;
                while (!downPosPool.isEmpty() && downPosPool.peek().int1 > j) {
                    a += downPosPool.pop().int2;
                }
                downPosPool.push(new IntPair(j, a));
            }
        }
        System.out.println(totalPool);
        
        int size = downPosPool.size();
        System.out.print(size + " ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(downPosPool.pollLast().int2 + " ");
        }
        System.out.print(downPosPool.pollLast().int2);
    }
    
    static class IntPair {
        int int1;
        int int2;
        IntPair(int i1, int i2) {
            int1 = i1;
            int2 = i2;
        }
    }
}
