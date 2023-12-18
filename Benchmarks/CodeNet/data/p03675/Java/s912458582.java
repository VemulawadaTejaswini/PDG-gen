import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if (!flag){
                dq.addLast(in.nextInt());
            } else {
                dq.addFirst(in.nextInt());
            }
            flag = !flag;
        }
        if (flag){
            while (!dq.isEmpty()){
                System.out.print(dq.pollFirst());
            }
        } else {
             while (!dq.isEmpty()){
                System.out.print(dq.pollLast());
            }           
        }
    }
}