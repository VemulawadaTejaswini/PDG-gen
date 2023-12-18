import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = l; i <= l + 2019 && i < r; ++i) {
            for (int j = l + 1; j < l + 2019 && j < r; ++j) {
                int m = (i * j) % 2019;
                if (min > m) {
                    min = m;
                }
            }
        }
        System.out.println(min);
    }
}

