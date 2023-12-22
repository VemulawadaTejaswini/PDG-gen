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
                    left.push(i);
                } else if(ci==')' && !left.isEmpty()){
                    left.pop();
                    left.pop();
                }else{   //右括号，且栈为空
                    right.push(ci);
                    right.push(i);
                }
            }

        }


        if(left.isEmpty() && right.isEmpty()) System.out.println("Yes");
        else System.out.println("No");

    }
}
