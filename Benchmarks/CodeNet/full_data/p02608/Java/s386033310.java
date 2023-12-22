import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int parN = Integer.parseInt(sc.next());
        sc.close();
        int[] result = new int[10000];
        int cur = 0;

        for (int z = 1; z <= 5; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    cur = (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (x * z);
                    if (cur != 0) {
                        if (x == z) {
                            result[cur - 1] = result[cur - 1] + 1;
                        } else if (x == y || y == z) {
                            result[cur - 1] = result[cur - 1] + 3;
                        } else {
                            result[cur - 1] = result[cur - 1] + 6;
                        }

                    }
                }
            }
        }

        for (int i = 0; i < parN; i++) {
            System.out.println(result[i]);
        }
    }

}