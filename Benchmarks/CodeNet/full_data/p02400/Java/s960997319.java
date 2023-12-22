import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = 0;
        double are = 0;
        double circ = 0;
        
        s = 3.141592653589;
        are = r * r * s;
        circ = 2 * r * s;
        
    System.out.printf("%.6f %.6f\n", are, circ);    
    }
}

