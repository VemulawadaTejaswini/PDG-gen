import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
    	int a, b, ans;
        char op;
        
        while (true){
            Scanner scan = new Scanner(System.in);
            
            String str = scan.next();
            a = Integer.parseInt(str);
            
            str = scan.next();
            op = str.charAt(0);
            
            str = scan.next();
            b = Integer.parseInt(str);
            
            if (op == '+'){
                ans = a + b;
                System.out.printf("%d\n", ans);
            }
            else if (op == '-'){
                ans = a - b;
                System.out.printf("%d\n", ans);
            }
            else if (op == '*'){
                ans = a * b;
                System.out.printf("%d\n", ans);
            }
            else if (op == '/'){
                ans = a / b;
                System.out.printf("%d\n", ans);
            }
            else break;
        }
    }
}