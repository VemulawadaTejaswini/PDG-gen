import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        String op;
        for(;;){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            if(op == "?") break;
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
        }
    }
}