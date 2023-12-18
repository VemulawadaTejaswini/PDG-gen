import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        sc.close();

        long minA = 1;
        long minB = 1;

        long rootN = (long) Math.sqrt(Double.parseDouble(String.valueOf(N)));

        minA = 1;
        for (long i = minA; i <= rootN; i++) {
            if (N % i == 0) {
                minA = i;
            }
        }

        minB = N / minA;

        System.out.println(minA + minB - 2);
    }

}
