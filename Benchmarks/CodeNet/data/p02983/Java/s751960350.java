import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int lim = Math.min(r, r + 4028);
        for (int i = l; i <= lim; ++i) {
            for (int j = i + 1; j <= lim; ++j) {
//                System.out.println(String.format(">> %d, %d -- %d", i, j, (i * j) % 2019));
                int m = (i * j) % 2019;
                if (min > m) {
                    min = m;
                }
            }
        }
        System.out.println(min);
    }
}

