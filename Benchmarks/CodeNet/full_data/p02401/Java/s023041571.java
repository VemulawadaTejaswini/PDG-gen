import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String plus = "+", minus = "-", time = "*", divide = "/", end = "?";
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            if(op.equals(plus)){
                System.out.println(a + b);
            }else if(op.equals(minus)){
                System.out.println(a - b);
            }else if(op.equals(time)){
                System.out.println(a * b);
            }else if(op.equals(divide)){
                System.out.println(a / b);
            }else if(op.equals(end)){
                break;
            }
        }
        sc.close();
    }
}
