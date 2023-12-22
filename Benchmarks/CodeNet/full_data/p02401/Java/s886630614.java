import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        do{
            int a = scan.nextInt();
            String s = scan.next();
            int b = scan.nextInt();
            
            if(s.equals("?"))
            break;
            
            int ans = 0;
            
            switch(s){
                case "+": 
                    ans = a+b; break;
                case "-":
                    ans = a-b; break;
                case "*":
                    ans = a*b; break;
                case "/": 
                    ans = a/b; break;
            }
            System.out.println(ans);
        }while(true);
    }
}
