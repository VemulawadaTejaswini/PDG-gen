import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int a = scanner.nextInt();
            String str = scanner.next();
            int b = scanner.nextInt();
            if  ("?".equals(str)) break;
            
            switch(str){
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
            }
        }
        
    }
}
