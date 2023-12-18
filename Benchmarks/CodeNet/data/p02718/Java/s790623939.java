import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        boolean bl = true;
        Arrays.sort(array);
        for (int i = n-1; i > n - m - 1; i--) {
            if (array[i] < sum / (4 * m)) {
                bl = false;
                break;
            }
        }
        System.out.println(bl?"Yes":"No");

    }
}
