import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        Integer[] c = new Integer[m];
        Integer[] d = new Integer[m];
        for (int i = 0; i < m; i++) {
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        String[] index = new String[n];
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int dist = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
                list.add(dist);
            }
            int min = list.stream().mapToInt(k -> k).min().getAsInt();
            index[i] = Integer.toString(list.indexOf(min) + 1);
        }

        String result = String.join("\n", index);

        // 出力
        System.out.println(result);
    }
}
