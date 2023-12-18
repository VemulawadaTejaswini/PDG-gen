import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double a2 = Math.sqrt(a);
        double b2 = Math.sqrt(b);
        double c2 = Math.sqrt(c);

        if(a2 + b2 < c2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}