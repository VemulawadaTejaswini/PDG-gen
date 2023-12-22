import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double pi = Math.PI;
        double area = r*r*pi;
        double length = r*2*pi;
        System.out.printf("%f %f", area, length);
    }
}
