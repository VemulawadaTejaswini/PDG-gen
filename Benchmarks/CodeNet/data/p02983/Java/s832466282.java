
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        int p = (int) (l % 2019);
        int q = (int) (r % 2019);

        if (r - l >= 2019) {
            System.out.println(0);
            return;
        }

        if (p > q ) {
            System.out.println(0);
            return;
        }

        long min = 1000000;
        for (int i = (int) l ; i < r ; i++) {
            for (int j = i + 1 ; j <= r ; j++) {
                min = Math.min((long) i * j % 2019, min);
            }
        }



        System.out.println(min);

    }

}