import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        x2 -= x1;
        y2 -= y1;
        double x = Math.pow(x2, 2);
        double y = Math.pow(y2, 2);
        double z = Math.sqrt(x + y);
        System.out.println(z);

    }

}
