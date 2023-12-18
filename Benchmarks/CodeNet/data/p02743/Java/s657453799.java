import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double roota = Math.sqrt(a);
        double rootb = Math.sqrt(b);
        double rootc = Math.sqrt(c);
        System.out.println(roota + rootb < rootc ? "Yes" : "No");
    }
}