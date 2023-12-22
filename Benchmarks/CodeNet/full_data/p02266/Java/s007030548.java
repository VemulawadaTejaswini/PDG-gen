import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //文字列を読み込む
        char[] c = s.toCharArray(); //文字単位で配列に詰める
        int sum = 0; //水たまりの面積
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        Deque<Water> stack2 = new ArrayDeque<Water>();
        for(int i=0; i<c.length; i++) {
            if(c[i]=='\\') {
                stack1.push(i);
            } else if (c[i]=='/' && !stack1.isEmpty()) {
                int n = stack1.pop();
                int a = i-n;
                sum += a;
                while(!stack2.isEmpty() && stack2.peek().index>n) {
                    a += stack2.pop().area;
                }
                Water water = new Water(n,a);
                stack2.push(water);
            }
        }
        System.out.println(sum);
        System.out.print(stack2.size());
        while(!stack2.isEmpty()) {
            System.out.print(" "+stack2.pollLast().area);
        }
        System.out.println();
    }
}
class Water {
    int index;
    int area;
    Water(int index, int area) {
        this.index = index;
        this.area = area;
    }
}

