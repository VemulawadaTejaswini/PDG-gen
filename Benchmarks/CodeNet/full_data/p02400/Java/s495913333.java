import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);        

        double r = scanner.nextDouble(); 
        
        double area = r * r * Math.PI;

        double around = 2 * r * Math.PI;

        System.out.printf("%f %f", area, around);

        scanner.close();

    }
}
