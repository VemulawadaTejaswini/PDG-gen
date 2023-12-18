import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(as));

        int count = 1;
        int previnc = as[0] - as[1];
        for (int i = 2; i < n; i++) {
            int inc = as[i - 1] - as[i];
            if (previnc == 0) {
                previnc = inc;
                continue;
            }
            if (inc == 0) {
                continue;
            }
            // 符号が変わったら増やす
            if (0 < previnc && inc < 0 || previnc < 0 && 0 < inc) {
                previnc = 0;
                count++;
            }
        }

        System.out.println(count);
    }
}
