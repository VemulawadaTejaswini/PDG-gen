import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(getCount(1, x, 0));

    }

    public static int getCount(int pre, int x, int count) {
        int diff = 0;

        if (pre == 1 || pre == 6) {
            diff = 5;
        } else {
            diff = 6;
        }

        if (x >= 0) {
            x = x - diff;
            count++;
            count = getCount(diff, x, count);
        }

        return count;
    }
}