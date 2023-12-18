import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Math.sqrt(sc.nextDouble());
        double b = Math.sqrt(sc.nextDouble());
        double c = Math.sqrt(sc.nextDouble());
        if (a + b < c) System.out.println("Yes");
        else System.out.println("No");
    }
}