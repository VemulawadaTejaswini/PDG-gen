import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int D = 1;
        while(D == 1){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int value;
             

            switch(op){
            
            case "+":
                value = a + b;
                System.out.println(value);
                break;
            case "-":
                value = a - b;
                System.out.println(value);
                break;
            case "*":
                value = a * b;
                System.out.println(value);
                break;
            case "/":
                value = a / b;
                System.out.println(value);
                break;
            case "?":
                D = 0;    
                break;
            }    
           
        }
        sc.close();

    }
}
