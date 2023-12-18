import java.util.HashMap;
import java.util.Scanner;

/*
説明
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        HashMap<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

            if (!map.containsKey(a[i])) {
                map.put(a[i], (long)1);
            } else {
                map.put(a[i], map.get(a[i])+1);
            }
        }

        long all = 0;
        // 全通りを求める
        for (int key :map.keySet()) {
            all += map.get(key) * (map.get(key) - 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            long tmp = map.get(a[i]);
            System.out.println(all - (tmp - 1));
        }
    }
}