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

        HashMap<Integer, Integer> all = new HashMap<>();
        for (int key :map.keySet()) {
            int temp = map.get(key);
            // 全体の数
            all.put(key, temp * (temp - 1) / 2);
        }

        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (int key :map.keySet()) {
                int temp = all.get(key);
                if (key == a[i]) {
                    ans += (map.get(key) - 1) * (map.get(key) - 2) / 2; 
                } else {
                    ans += all.get(key); 
                }
            }
            System.out.println(ans);
        }
    }
}