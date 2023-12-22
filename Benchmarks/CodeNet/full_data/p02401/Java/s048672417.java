import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int answer=0;
            switch(op) {
            case "+":
            	answer=a+b;
            	break;
            case "-":
            	answer=a-b;
            	break;
            case "*":
            	answer=a*b;
            	break;
            case "/":
            	answer=a/b;
            	break;
            case "?":
            	break;
            
            
            }
            if(op.equals("?"))break;
           System.out.printf("%d\n",answer);
           
        }
        sc.close();
        
    }
}
