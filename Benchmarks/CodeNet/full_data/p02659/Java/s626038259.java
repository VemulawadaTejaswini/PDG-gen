import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        double b = scanner.nextDouble();

        long bb = (long)(b * 100);
        long result = (a * bb) / 100;
        System.out.println(result);

    }
}