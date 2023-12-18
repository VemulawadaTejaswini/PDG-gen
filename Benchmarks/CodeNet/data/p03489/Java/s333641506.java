import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int res = 0;
        for (Integer key: map.keySet()) {
            if (key > map.get(key)) {
                res += map.get(key);
            } else if (key < map.get(key)) {
                res += map.get(key) - key;
            }
        }

        System.out.println(res);
    }
}
