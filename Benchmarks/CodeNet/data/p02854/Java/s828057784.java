import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        array[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + sc.nextLong();
        }
        long target = array[n - 1] / 2;
        long nearest = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long gap = Math.abs(target - array[i]);
            if (nearest < gap) {
                long d = array[n - 1] - array[i - 1];
                System.out.println(Math.abs(d -  array[i - 1]));
                return;
            } else {
                nearest = gap;
            }
        }
    }
}