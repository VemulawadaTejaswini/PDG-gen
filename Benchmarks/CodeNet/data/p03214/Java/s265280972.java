import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());
        double average = Arrays.stream(a).average().getAsDouble();
        int ans = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (Math.abs(a[i] - average) <= Math.abs(a[ans] - average)) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}