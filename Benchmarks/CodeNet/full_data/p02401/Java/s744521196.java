import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            char c = op.charAt(0);
            if(b==0){
                break;
            }
            if(c=='+'){
                System.out.println(a+b);
            }else if(c=='-'){
                System.out.println(a-b);
            }else if(c=='*'){
                System.out.println(a*b);
            }else if(c=='/'){
                System.out.println(a/b);
            }else if(c=='?'){
                break;
            }
        }


    }
}
