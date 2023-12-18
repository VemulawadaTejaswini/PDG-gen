import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()) - 1);
        sc.close();

        // 主処理
        Deque<Integer> dq = new ArrayDeque<>();
        int now = 0;
        while (!dq.contains(now)) {
            dq.add(now);
            now = a[now];
        }
        List<Integer> loopNum = new ArrayList<>(dq);

        int loopCount = loopNum.size() - loopNum.indexOf(now);

        int result = 0;

        if (loopNum.size() < k) {
            k = (k - loopNum.indexOf(now)) % loopCount + loopNum.indexOf(now);
        }

        result = loopNum.get((int) k);
        result++;

        // 出力
        System.out.println(result);
    }
}
