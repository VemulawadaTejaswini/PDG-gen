import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.keySet().contains(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        int sum = 0;
        for (int val : map.values()) {
            sum += val * (val - 1) / 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(sum - (map.get(a[i]) - 1));
        }
        sc.close();
    }
}