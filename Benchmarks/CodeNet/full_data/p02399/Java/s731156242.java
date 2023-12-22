import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
                int quotient = a / b;
                int remainder = a % b;
                double floatno = (double) a / (double) b;
                System.out.printf("%d %d %.5f",quotient,remainder,floatno);
    }

}
