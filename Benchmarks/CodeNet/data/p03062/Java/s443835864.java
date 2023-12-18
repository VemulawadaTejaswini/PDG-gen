import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        int neg = 0;
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                hasZero = true;
            }
            if (a[i] < 0) {
                neg++;
            }
            sum += Math.abs(a[i]);
        }
        if (hasZero || neg % 2 == 0) {
            System.out.println(sum);
            return;
        }
        System.out.println(sum - 2 * Math.min(Math.abs(a[0]), Math.abs(a[n - 1])));
    }

}
