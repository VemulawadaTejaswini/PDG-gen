import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        double pi = Math.PI;

        int area = pi * r * r;
        int length = 2 * pi * r;

        System.out.printf("%f %f", area, length);
    }
}