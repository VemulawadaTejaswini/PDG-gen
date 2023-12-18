
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double menseki = (double) (W * H) / (double) 2;
        double halfW = (double) W/2;
        double halfH = (double) H/2;
        
        int divType = 0;
        if (Double.compare(x, halfW) == 0 && Double.compare(y, halfH) == 0) {
            divType = 1;
        }
        System.out.printf("%f %d\n", menseki, divType);
    }
}