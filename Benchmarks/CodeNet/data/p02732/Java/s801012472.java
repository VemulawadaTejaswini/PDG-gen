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

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i])+1);
            }
        }

        for (int i = 0; i < n; i++) {
            int ans = 0;

            for (int key :map.keySet()) {
                if (key == a[i]) {
                    ans += (map.get(key) - 1) * (map.get(key) - 2) / 2;
                } else {
                    ans += map.get(key) * (map.get(key) - 1) / 2;
                }
            }

            if (map.size() == 1) {
                ans += map.get(a[0]) * (map.get(a[0]) - 1) / 2;
            }
            System.out.println(ans);
        }

    }
}