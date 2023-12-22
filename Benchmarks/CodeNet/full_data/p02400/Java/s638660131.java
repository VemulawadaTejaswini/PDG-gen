import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double A = (double)r * r * Math.PI;
        double L = (double)r * 2 * Math.PI;
        System.out.println(String.format("%f", A) + " " + String.format("%f", L));
    }   
}