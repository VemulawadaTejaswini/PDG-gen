import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String op = sc.next();
        int y = sc.nextInt();

        while(true){
            if(op.equals("+")){
                System.out.println(x + y);
                break;
            }else if(op.equals("-")){
                System.out.println(x - y);
                break;
            }else if(op.equals("*")){
                System.out.println(x * y);
                break;
            }else if(op.equals("/")){
                System.out.println(x / y);
                break;
            }else{
                break;
            }
        }
        sc.close();
    }
}
