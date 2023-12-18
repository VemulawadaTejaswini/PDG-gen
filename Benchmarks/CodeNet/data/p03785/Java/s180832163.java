import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] t = new Integer[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        Arrays.sort(t);
        int result = 0;
        int count = 0;
        int nextDepartureTimeIndex = 0;
        int nextDepartureTime = t[nextDepartureTimeIndex] + k;
        for (int i = 0; i < n; i++) {
            boolean isBefore = t[i] <= nextDepartureTime;
            if (isBefore) {
                count++;
            }
            while (nextDepartureTime <= t[i] && 0 < count) {
                result++;
                int minus = Math.min(count, c);
                count -= minus;
                nextDepartureTimeIndex += minus;
                if (n - 1 < nextDepartureTimeIndex) {
                    count += n - i;
                    break;
                }
                nextDepartureTime = t[nextDepartureTimeIndex] + k;
            }
            if (!isBefore) {
                count++;
            }
        }
        if (0 < count) {
            result += Math.ceil((double) count / c);
        }

        // 出力
        System.out.println(result);
    }
}
