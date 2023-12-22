import java.util.Scanner;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
        double a=sc.nextInt();
        double b=a*a*Math.PI;
        double c=2*a*Math.PI;
	System.out.printf("%f %f",b,c);
       
    }
}
