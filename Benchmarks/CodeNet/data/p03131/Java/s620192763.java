import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long biscuits = 1;
        if (k <= a || a + 2 > b) {
            biscuits += k;
        } else {
            if ((k - a) % 2 == 0) {
                biscuits = b + (k - a - 1) / 2 * (b - a) + 1;
            } else {
                biscuits = b + (k - a - 1) / 2 * (b - a);
            }
        }
        System.out.println(biscuits);
    }

}
