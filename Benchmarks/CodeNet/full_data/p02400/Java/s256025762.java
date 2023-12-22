import java.util.Scanner;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
        double a=sc.nextInt();
        double b=2*a*Math.PI;
        double c=a*a*Math.PI;
	System.out.printf("%f %f\n",b,c);
       
    }
}
