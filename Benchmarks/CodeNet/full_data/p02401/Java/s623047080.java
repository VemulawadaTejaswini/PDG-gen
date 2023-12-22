import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        while(op.equals("?") == false){
            System.out.println(Calculate(a,op,b));
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
        }
        sc.close();
    }

    public static int Calculate(int a, String op, int b){
        int result = 0;
        switch(op){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
        } 
        return result;   
    }
}
