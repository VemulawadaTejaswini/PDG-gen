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
        boolean[] used = new boolean[n];
        List<Integer> loopNum = new ArrayList<>();
        int now = 0;

        while (!used[now]) {
            used[now] = true;
            loopNum.add(now);
            now = a[now];
        }

        int primalyCount = loopNum.indexOf(now);
        int size = loopNum.size();
        int loopCount = size - primalyCount;

        if (size < k) {
            k = (k - primalyCount) % loopCount + primalyCount;
        }

        int result = loopNum.get((int) k) + 1;

        // 出力
        System.out.println(result);
    }
}
