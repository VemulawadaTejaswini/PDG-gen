import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int ml = l % 2019;
        int mr = r % 2019;

        if ( r - l + 1 >= 2019) {
            System.out.println(0);
        } else if(ml > mr) {
            System.out.println(0);
        } else {
            System.out.println((ml * (ml + 1)) % 2019);
        }


    }
}