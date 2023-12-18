import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        long min1 = Long.MAX_VALUE;
        long min2 = min1;
        int tmp = Math.min(r, l + 2020);
        for (int i = l; i <= tmp; i++) {
            if (min1 % 2019 >= i % 2019) {
                min2 = min1;
                min1 = i;
            } else if (min2 % 2019 > i % 2019) {
                min2 = i;
            }
        }

        System.out.println((min1 * min2) % 2019);
    }
}