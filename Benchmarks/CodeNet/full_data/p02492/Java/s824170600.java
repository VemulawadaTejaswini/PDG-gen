import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if(op.equals("?"))break;        
            else if (op.equals("+")){
                answer = a + b;
            }
            else if(op.equals("-")){
                answer = a - b;
            }
            else if(op.equals("*")){
                answer = a * b;
            }
            else if(op.equals("/")){
                answer = a / b;
            }                                 
            System.out.println(answer);   
        }
    }
}