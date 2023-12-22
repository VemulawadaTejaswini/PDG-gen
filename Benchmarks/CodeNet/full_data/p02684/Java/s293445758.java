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
        List<Integer> loopNum = new ArrayList<>();
        int now = 0;
        while (!loopNum.contains(now)) {
            loopNum.add(now);
            now = a[now];
        }

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
