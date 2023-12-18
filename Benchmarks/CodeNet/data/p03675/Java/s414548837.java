import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Deque<Integer> dq = new Deque<Integer>();
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if (!flag){
                dq.addLast(in.nextInt());
            } else {
                dq.addFirst(in.nextInt());
            }
            flag = !flag;
        }
        int begin = flag ? n - 1 : 0;
        int end = flag ? 0 : n - 1;
        int inc = flag ? -1 : 1;
        for (int i = begin; i += inc; i >= 0 && i <= n - 1){
            system.out.print(dq.get(i) + " ");
        }
    }
}