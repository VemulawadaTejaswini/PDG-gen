import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        double f;

        a = sc.nextInt();
        b = sc.nextInt();

         f = (double)a / (double)b;



        System.out.printf("%d %d %.5f\n", a/b, a%b, f);
    }
}
