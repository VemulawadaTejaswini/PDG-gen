import java.util.Scanner;

public class Main{
    public static void Calc(int x, String op, int y){
        int S;
        switch(op){
            case "+":
            S = x + y;
            System.out.println(S);
            break;

            case "-":
            S = x - y;
            System.out.println(S);
            break;

            case "*":
            S = x * y;
            System.out.println(S);
            break;

            case "/":
            S = x / y;
            System.out.println(S);
            break;

            default:
            break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S;
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            Calc(a, op, b);
            if(op.equals("?")){
                break;
            }
        }
        sc.close();

    }
}
