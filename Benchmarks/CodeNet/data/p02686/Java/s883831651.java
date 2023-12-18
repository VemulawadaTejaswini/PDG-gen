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
        for(String s : bs){
            char[] c = s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='(') {
                    left.push(c[i]);
                } else if(c[i]==')' && !left.isEmpty()){
                    left.pop();
                }else{   //右括号，且栈为空
                    right.push(c[i]);
                }
            }
            
        }

        if(left.isEmpty() && right.isEmpty()) System.out.println("Yes");
        else System.out.println("No");


    }
}
