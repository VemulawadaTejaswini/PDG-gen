import java.util.Scanner;

public class calcurator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flg = 1;
        int a,b;
        String op;
        while(flg > 0) {
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            if(op == "?") flg = -1;
            switch(op) {
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