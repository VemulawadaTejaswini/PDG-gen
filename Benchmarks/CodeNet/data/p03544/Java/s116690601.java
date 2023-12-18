import java.util.Scanner;

public class Main {

    private static Long lucas(Long n) {
        if (n == 0) {
            return 2L;
        }
        if (n == 1) {
            return 1L;
        }
        return lucas(n - 1) + lucas(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(lucas(n));
    }

}
