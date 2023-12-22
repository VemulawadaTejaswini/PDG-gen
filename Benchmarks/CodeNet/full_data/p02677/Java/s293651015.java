import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        double timeSpeed = 360. / 12 / 60;
        double minuteSpeed = 360. / 1 / 60;

        double x = (minuteSpeed - timeSpeed) * (h * 60 + m);

        double c2 = a * a + b * b - 2 * a * b * Math.cos(x * Math.PI / 180);

        System.out.println(Math.sqrt(c2));
    }
}