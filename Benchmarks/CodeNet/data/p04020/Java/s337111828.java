import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Long> cnts = new TreeMap<>();
        for (int i = 1; i <= N; i++) {
            long a = sc.nextLong();

            if (cnts.containsKey(i)) {
                a += cnts.get(i);
            }

            cnts.put(i, a);
        }

        // 小さい順番から貪欲にペアを作成
        int pairs = 0;
        long beforeNum = -100;
        long restCnt = 0;
        for (Map.Entry entry : cnts.entrySet()) {
            long num = (int) entry.getKey();
            long cnt = (long) entry.getValue();

            while (num - beforeNum == 1 && restCnt > 0 && cnt > 0) {
                pairs++;
                restCnt--;
                cnt--;
            }

            pairs += cnt / 2;
            beforeNum = num;
            restCnt = cnt % 2;
        }

        out.println(pairs);
    }
}