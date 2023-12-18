import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 全部が最大値の場合もあるので、数値ごとに個数をカウント
        Map<Integer, Integer> dscMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            dscMap.put(a[i], dscMap.getOrDefault(a[i], 0) + 1);
        }

        // 最大と次に大きい数を求める。最大値が複数個ある場合、最大と次に大きい値は同値。
        int cnt = 0;
        int max = 0;
        int nxt = 0;
        for (Entry<Integer, Integer> ent : dscMap.entrySet()) {
            cnt++;
            if (ent.getValue() > 1) {
                max = ent.getKey();
                nxt = max;
                break;
            }

            if (cnt == 1) {
                max = ent.getKey();
            } else {
                nxt = ent.getKey();
                break;
            }
        }

        // 規約通りにシミュレーション
        for (int i = 0; i < n; i++) {
            int t = a[i];
            if (t == max) {
                System.out.println(nxt);
            } else {
                System.out.println(max);
            }
        }
    }
}

