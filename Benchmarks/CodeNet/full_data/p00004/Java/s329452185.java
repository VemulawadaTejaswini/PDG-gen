import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int e = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());

            double x = (c*e - b*f) / (a*e - b*d);
            double y = (c - a*x) / b;

            System.out.printf("%4.3f %4.3f\n", x, y);
        }
    }
}