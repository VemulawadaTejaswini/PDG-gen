
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for(;i<100;i++){
            int a = sc.nextInt();
            String x = sc.next();
            int b = sc.nextInt();
            sc.next();
            if(x == "+"){
                System.out.printf("%d¥n",a+b);
            }
            if(x == "-"){
                System.out.printf("%d¥n",a-b);
            }
            if(x == "*"){
                System.out.printf("%d¥n",a*b);
            }
            if(x == "/"){
                System.out.printf("%d¥n",a/b);
            }
            if(x == "?"){
                break;
            }
        }
        
    }
}
