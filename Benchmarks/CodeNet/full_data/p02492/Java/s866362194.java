import java.util.*;
class Main{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a, b, result=0;
    char op;
    while(true){
            a = s.nextInt();
            op = s.next().charAt(0);
            b = s.nextInt();
         
        if(op == '?') break;
        if(op == '+') result = a + b;
        if(op == '-') result = a - b;
        if(op == '*') result = a * b;
        if(op == '/') result = a / b;
 
        System.out.println(result);
    }
    }
}