import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();
        double s=r*r*3.14159265359;
        double l=2*r*3.14159265359;
        System.out.printf("%f %f\n", s,l);
        
    }

}