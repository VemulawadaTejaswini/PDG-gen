import java.util.Scanner;

class Sta{
    int[] s;
    int top;
    Sta(){
        s=new int[1000];
        top=0;
    }
    void push(int x){
        top++;
        s[top]=x;
    }
    int pop(){
        top--;
        return s[top+1];
    }
}
public class Main {
    static Sta stack=new Sta();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        while(sc.hasNext()){
            String x=sc.next();
            if(x.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(x.equals("-")){
                stack.push(stack.pop()-stack.pop());
            }else if(x.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else{
                int t=Integer.parseInt(x);
                stack.push(t);
            }
        }
        System.out.println(stack.pop());
    }
}