import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double aa = Math.sqrt(a);
        double bb = Math.sqrt(b);
        double cc = Math.sqrt(c);
        if (aa + bb < cc){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
