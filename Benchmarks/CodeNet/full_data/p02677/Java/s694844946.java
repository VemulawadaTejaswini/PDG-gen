import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        double Mdeg = H * 30 + (M * 30) / 60;
        double Hdeg = M * 6;
        double deg = Mdeg - Hdeg;
        if (deg > 180) {
            deg = 360 - deg;
        }
        double cSquare = A * A + B * B - (2 * A * B * Math.cos(Math.toRadians(deg)));
        System.out.println(Math.sqrt(cSquare));
    }
}
