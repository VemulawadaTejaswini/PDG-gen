import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long origin = 100;
        long x = scanner.nextLong();

        long year = 0;

        while (origin < x) {
            origin = origin + (origin / 100);
            year++;
        }

        System.out.println(year);
    }
}