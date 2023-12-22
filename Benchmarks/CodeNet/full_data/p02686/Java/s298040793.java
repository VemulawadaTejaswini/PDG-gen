//package contests;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] bs = new String[N];
        for(int i=0;i<N;i++){
            bs[i] = input.next();
        }

        //start
        Stack left = new Stack();
        Stack right = new Stack();
        for(int i=0;i<bs.length;i++){    //每一行自己消耗掉一些括号
            char[] c = bs[i].toCharArray();
            for(char ci : c){
                if(ci=='(') {
                    left.push(ci);
                } else if(ci==')' && !left.isEmpty()){
                    left.pop();
                }else{   //右括号，且栈为空
                    right.push(ci);
                }
            }
            if(left.peek().equals('('))    left.push(i);
            if(left.peek().equals(')'))    right.push(i);
//            //怎么记录是不是同一轮剩下的左右括号呢
//            while(!left.isEmpty() && !right.isEmpty()){
//                right.pop();
//                left.pop();
//            }
        }
        //如果左右括号栈栈顶说明他们来自相同行
        if(!left.isEmpty() && !right.isEmpty() && !left.peek().equals('(') && !left.peek().equals(right.peek())){
            left.pop();
            right.pop();
            while(left.peek().equals('(')){
                if(!right.isEmpty()){
                    left.pop();
                    right.pop();
                }
            }
        }
        

        if(left.isEmpty() && right.isEmpty()) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
