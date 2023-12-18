import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        List<Integer> as = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        // どの数値が何個あったかのマップ
        for (int i = 0; i < split.length; i++) {
            int k = Integer.parseInt(split[i]);
            as.add(k);
            Integer v = map.get(k);
            if (v == null) {
                map.put(k, 1);
            } else {
                v++;
                map.put(k, v);
            }
        }

        // 数値ごとのコンビネーションを計算して保持するためのMap
        Map<Integer, Long> combMap = new HashMap<>();
        for (int i = 0; i < as.size(); i++) {
            Integer integer = as.get(i);
            Long out = 0l;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer count = entry.getValue();
                if (entry.getKey() == integer) {
                    count--;
                }

                Long comb = combMap.get(count);
                if (comb == null) {
                    comb = calcCombination(count, 2);
                    combMap.put(count, comb);
                }
                out += comb;
            }

            System.out.println(out);
        }
    }

    private static long calcCombination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
