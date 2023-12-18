import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        double temp = a / 0.08;
        if ((int)Math.floor(temp * 0.1) == (int)b)
            System.out.println((int)temp);
        else
            System.out.println("-1");

    }
}
