import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14159265359;
        int r = scanner.nextInt();

        System.out.printf("%f %f", r*r*PI, 2*PI*r);

        scanner.close();
    }
}
