import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        Integer[] a = new Integer[q];
        Integer[] b = new Integer[q];
        Integer[] c = new Integer[q];
        Integer[] d = new Integer[q];
        for (int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        List<List<Integer>> comblist = getCombinationList(m, n);

        int max = 0;
        for (List<Integer> comb : comblist) {
            int sum = 0;
            for (int i = 0; i < q; i++) {
                int ab = comb.get(b[i] - 1);
                int aa = comb.get(a[i] - 1);
                if (ab - aa == c[i]) {
                    sum += d[i];
                }
            }
            max = Math.max(max, sum);
        }

        long result = max;

        // 出力
        System.out.println(result);
    }

    public static List<List<Integer>> getCombinationList(int n, int k) {
        List<List<Integer>> combinationList = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    list.add(j + 1);
                }
            }
            if (list.size() == k) {
                combinationList.add(list);
            } else if (list.size() != 0 && list.size() < k) {
                int remain = k - list.size();
                int num = list.get(0);
                for (int j = 0; j < remain; j++) {
                    list.add(num);
                }
                Collections.sort(list);
                combinationList.add(list);
            }
        }
        return combinationList;
    }
}
