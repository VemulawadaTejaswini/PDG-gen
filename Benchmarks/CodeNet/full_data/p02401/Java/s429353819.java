import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String op;
        int b;
        int c;
        while (true) {
             a = sc.nextInt();
             op = sc.next();
             b = sc.nextInt();

            if (op.equals("?")){
                break;}
            if (op.equals("+")){
                c = a + b;
                System.out.println(c);}
            else if (op.equals("-")){
                c = a - b;
            System.out.println(c);}
            else if (op.equals("*")){
                c = a * b;
            System.out.println(c);}
            else{
            c = a / b;
            System.out.println(c);}
        }
    }
}
