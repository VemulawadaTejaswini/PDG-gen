import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            double xa = sc.nextDouble();
            double ya = sc.nextDouble();
            double ra = sc.nextDouble();
            double xb = sc.nextDouble();
            double yb = sc.nextDouble();
            double rb = sc.nextDouble();
            double d2 = Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2);
            if (d2 <= Math.pow(ra + rb, 2)) {
                if (d2 <= Math.pow(ra - rb, 2)) {
                    if (ra - rb >= 0)
                        System.out.println(2);
                    else
                        System.out.println(-2);
                } else
                    System.out.println(1);
            } else
                System.out.println(0);

            n--;
        }

    }
}