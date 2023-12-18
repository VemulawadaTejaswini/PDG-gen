import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String a =sc.next();
        String b =sc.next();
        double num = Integer.parseInt(a+b);
        double c =(int)Math.sqrt(num);
        if (c*c == num){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
