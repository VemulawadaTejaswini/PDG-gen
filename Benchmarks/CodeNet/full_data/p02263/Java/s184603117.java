import java.util.*;
import java.io.*;

class Main{
        static final String[] operator = {"+", "-", "*"};
        static boolean lastIsOr = false;
        static Stack<Integer> stack = new Stack<Integer>();
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static int point = 0;

        static void doPlus(){
                int a=0;
                if(lastIsOr)
                        point = 0;
                for(int i=stack.size(); i>point; i--)
                        a += stack.pop();
                stack.push(a);
                point = stack.size();
                lastIsOr = true;
        }
        static void doMinus(){
                int a = 0;
                if(lastIsOr)
                        point = 0;
                for(int i=stack.size(); i>point+1; i--)
                        a = a - stack.pop();
                a += stack.pop();
                stack.push(a);
                point = stack.size();
                lastIsOr = true;
        }
        static void doMul(){
                int a=1;
                if(lastIsOr)
                        point = 0;
                for(int i=stack.size(); i>point; i--)
                        a *= stack.pop();
                stack.push(a);
                point = stack.size();
                lastIsOr = true;
        }
        static void doPop(String i){
                stack.push(new Integer(i));
                lastIsOr = false;
        }
        public static void main(String[] args) throws IOException{
                String[] elements = br.readLine().split(" ");
                for(String e : elements){
                        switch (e){
                                case "+":
                                        doPlus();
                                        break;
                                case "-":
                                        doMinus();
                                        break;
                                case "*":
                                        doMul();
                                        break;
                                default:
                                        doPop(e);
                        }
                }
                while(!stack.empty()){
                        System.out.print(stack.pop());
                        if(!stack.empty())
                                System.out.print(" ");
                }
                System.out.println();
        }
}