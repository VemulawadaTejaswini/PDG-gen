import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long n = scanner.nextLong();


        long result = (long) (Math.floor((a * n) / b) - (a * Math.floor(n / b)));
        System.out.println(result);

    }
}