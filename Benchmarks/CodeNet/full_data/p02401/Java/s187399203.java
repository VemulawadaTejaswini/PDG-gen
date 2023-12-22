import java.util.Scanner;
class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            
           if(op.equals("?")){
               break;
           }


            
            int x = 0;
            
            switch(op){
            case "+":
                x = a + b;
                break;
            case "-":
                x = a - b;
                break;
            case "*":
                x = a * b;
                break;
            case "/":
                x = a / b;
                break;
            }
            
            System.out.println(x);
            
        }   
        
    }
}
