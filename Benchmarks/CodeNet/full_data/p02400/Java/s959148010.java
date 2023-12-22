import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x=sc.nextDouble();
        double pi=Math.PI;
        double area=x*x*pi;
        double length=2*x*pi;
        System.out.printf("%f %f",area,length);
        sc.close();

    }
}

