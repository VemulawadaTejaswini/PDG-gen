import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long origin = 100;
        long x = scanner.nextLong();

        long year = 0;

        while (origin <= x) {
            origin = (long) Math.floor((origin) * 1.01);
            year++;
        }

        System.out.println(year);


    }
}