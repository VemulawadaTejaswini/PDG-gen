import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = Math.PI;
        double r = sc.nextInt();
        
        double m=r*r*x;
        double n=(r+r)*x;
        
        System.out.printf("%.6f\n",m);
            System.out.printf("%.6f\n",n);
    }
}
