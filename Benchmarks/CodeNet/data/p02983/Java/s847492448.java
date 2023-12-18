import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        if (r - l + 1 >= 2019) {
            System.out.println(0);
            return;
        }
        long min = l;
        for (long i = l; i < r; i++) {
            min = Math.min(min, i % 2019);
        }
        System.out.println(min % 2019 * (min + 1) % 2019);
    }

}
