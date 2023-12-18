import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        long G = sc.nextLong();
        int[] p = new int[D];
        long[] c = new long[D];
        for(int i = 0; i < D; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }

        int sumCnt = Integer.MAX_VALUE;
        for (int i = 0; i < Math.pow(2, D) - 1; i++) {
            long result = 0;
            int cnt = 0;
            int rest = 0;
            for (int j = 0; j < D; j++) {
                if ((1 & i >> j) == 1) {
                    result += (j + 1) * 100 * p[j] + c[j];
                    cnt += p[j];
                } else {
                    rest = j;

                }
            }
            if (result < G) {
                int need = (int) Math.ceil((G - result) / ((rest + 1) * 100F));
                if (need > p[rest]) {
                    continue;
                }
                cnt += Math.ceil((G - result) / ((rest + 1) * 100F));
            }
            sumCnt = Math.min(sumCnt, cnt);
        }
        System.out.println(sumCnt);
    }
}