
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();	//入力の文字数
         
        Deque<Integer> downPos = new ArrayDeque<>();
        Deque<IntPair> downPosPool = new ArrayDeque<>();
         
        int totalPool = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '\\') {
                downPos.push(i);
            } else if (ch == '/' && !downPos.isEmpty()) {
                int down_pos = downPos.pop();
                int haba = i - down_pos;
                totalPool += haba;
                while (!downPosPool.isEmpty() && downPosPool.peek().int1 > down_pos) {
                    haba = haba +  downPosPool.pop().int2;
                }
                downPosPool.push(new IntPair(down_pos, haba));
            }
        }
        System.out.println(totalPool);
         
        int size = downPosPool.size();
        System.out.print(size);
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
            System.out.print(downPosPool.pollLast().int2);
        }
        System.out.println();
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
 
