import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        long money = 1000;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                money += (a[i] - a[i - 1]) * (money / a[i - 1]);
            }
        }

        System.out.println(money);
    }
}