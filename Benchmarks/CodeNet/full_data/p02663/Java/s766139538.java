import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int minutes = scanner.nextInt();

        int ms1 = h1 * 60 + m1;
        int ms2 = h2 * 60 + m2;

        int result = ms2 - ms1 - minutes;
        System.out.println(result);
    }
}