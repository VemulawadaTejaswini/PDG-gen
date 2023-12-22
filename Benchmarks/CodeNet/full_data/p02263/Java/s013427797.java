import java.util.Scanner;

public class Main {
    
    static int[] s;
    static int top;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        s = new int[200];
        top = 0;
        
        while(sc.hasNext()){
            String st = sc.next();
            int a, b;
            if(st.equals("+")){
                b = pop();
                a = pop();
                push(a+b);
            }else if(st.equals("-")){
                b = pop();
                a = pop();
                push(a-b);
            }else if(st.equals("*")){
                b = pop();
                a = pop();
                push(b*a);
            }else{
                push(Integer.parseInt(st));
            }
        }
        
        System.out.println(pop());
    }
    
    static void push(int x){
        top++;
        s[top] = x;
    }
    
    static int pop(){
        top--;
        return s[top+1];
    }
}
