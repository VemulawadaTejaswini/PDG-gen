import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] l = new int[n];
        Arrays.setAll(l, i -> scanner.nextInt());
        Arrays.sort(l);
        Arrays.parallelPrefix(l, Integer::sum);
        System.out.println(l[n - 1] - l[n - k - 1]);
    }
}