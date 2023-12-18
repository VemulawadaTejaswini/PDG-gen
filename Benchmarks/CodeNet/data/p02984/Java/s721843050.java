import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long l = Integer.parseInt(sc.next());
        long r = Integer.parseInt(sc.next());

        l = l % 2019;
        r = r % 2019;

        long min = 2018;
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                if ((i * j) % 2019 < min) {
                    min = (i * j) % 2019;
                }
            }
        }
        System.out.print(min);
    }
}