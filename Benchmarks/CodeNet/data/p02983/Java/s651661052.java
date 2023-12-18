import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        long min = Long.MAX_VALUE;
        long tmp = Math.min(r, l + 2020);
        for (long i = l; i < tmp; i++) {
            min = Math.min(i % 2019, min);
        }

        System.out.println(min * (min + 1));
    }
}