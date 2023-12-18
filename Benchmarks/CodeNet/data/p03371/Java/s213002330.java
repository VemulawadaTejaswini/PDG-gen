import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int x = cin.nextInt();
        int y = cin.nextInt();

        if (a + b < c * 2) {
            System.out.println(a * x + b * y);
        } else if (x == y) {
            System.out.println(c * x * 2);
        } else {
            int majorityPrice = x > y ? a : b;
            int distance = Math.max(x, y) - Math.min(x, y);
            int price = c * Math.min(x, y) * 2 +
                    (majorityPrice < c * 2 ? majorityPrice * distance
                                           : c * 2 * distance);
            System.out.println(price);
        }
    }
}
