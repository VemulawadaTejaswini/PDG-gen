
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int c = x - a;
        int z = y - b;
        int d = (c * c) + (z * z);
        double p = Math.sqrt(d);
        System.out.println(p);

    }
}

