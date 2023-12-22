import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a,b;
        String op;
        for(;;){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            System.out.println(op);
            switch(op){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                default:
                    break;
            }
            if (op == "?") break;
        }
    }
}