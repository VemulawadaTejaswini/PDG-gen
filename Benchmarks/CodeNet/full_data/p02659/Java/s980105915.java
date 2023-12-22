import java.util.Scanner;						  
public class Main{
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);
        int a = stdIn.nextInt();
        double b = stdIn.nextDouble();
        double c=a*b;
        c=c-c%1;
        System.out.printf("%.0f",c);
    }
}