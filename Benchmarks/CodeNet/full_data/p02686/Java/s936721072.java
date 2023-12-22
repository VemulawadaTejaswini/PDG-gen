//package contests;

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
                    left.push(i);       //把行号也压入栈
                } else if(ci==')' && !left.isEmpty()){
                    left.pop();
                    left.pop();
                }else{   //右括号，且栈为空
                    right.push(ci);
                    right.push(i);
                }
            }
        }

        //如果剩下的左栈和右栈的括号不属于同一行的就可以抵消
        while(!left.isEmpty() && !right.isEmpty() && !left.peek().equals(right.peek())){
            left.pop();
            left.pop();
            right.pop();
            right.pop();
        }


        if(left.isEmpty() && right.isEmpty()) System.out.println("Yes");
        else System.out.println("No");

    }
}
