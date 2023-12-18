import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 2; i <= n; i++) {
            a[i] = sc.nextInt();
            List<Integer> list = map.get(a[i]);
            list.add(i);
            map.put(a[i], list);
        }
        for (int i = 1; i <= n; i++) {
            List<Integer> list = map.get(i);
            System.out.println(list.size());
        }
    }

}
