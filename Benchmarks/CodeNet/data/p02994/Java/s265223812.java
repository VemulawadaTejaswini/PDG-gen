import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int all = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            all += l + i;
            if (Math.abs(l + i) < Math.abs(min)) {
                min = l + i;
            }
        }
        System.out.println(all - min);
    }
}