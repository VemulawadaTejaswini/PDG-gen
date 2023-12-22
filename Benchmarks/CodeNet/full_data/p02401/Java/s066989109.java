import java.util.Scanner;
public class Main {
    public static int a;
    public static int b;
    public static String op;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a = sc.nextInt();
            op= sc.next();
            b = sc.nextInt();
            switch(op){
                case "?" :{
                    sc.close();
                    return;
                }
                case "*": System.out.println (a*b); break;
                case "+": System.out.println (a+b); break;
                case "-": System.out.println (a-b); break;
                case "/": System.out.println (a/b); break;
            }
        }
    }
}
