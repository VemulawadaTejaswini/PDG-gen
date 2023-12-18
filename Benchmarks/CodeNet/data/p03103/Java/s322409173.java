import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[] { Integer.parseInt(sc.next()), Integer.parseInt(sc.next()) });
        }

        // 主処理
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Collections.sort(list, comparator);

        long result = 0;
        int count = 0;
        for (int i = 0; count < m; i++) {
            int num = list.get(i)[1];
            if (num <= m - count) {
                result += (long) list.get(i)[0] * num;
                count += num;
            } else {
                result += (long) list.get(i)[0] * (m - count);
                count = m;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}