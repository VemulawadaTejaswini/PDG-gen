import java.util.Scanner;
public class Main {

    static double circumference(double r){
        double PI = 3.14159265358979311600;
        double cir = 2*PI*r;
        return cir;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double result =(circumference(r));
        System.out.println("Circumference = "+ result);
    }

}



