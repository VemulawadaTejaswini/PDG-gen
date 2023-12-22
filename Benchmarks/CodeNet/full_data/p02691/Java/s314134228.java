import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            array[i - 1] = sc.nextInt();
            int v = i - array[i - 1];
            Integer t = map.get(v);
            if (t == null) {
                map.put(v, 1);
            } else {
                map.put(v, ++t);
            }
        }

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            Integer v = map.get(i + array[i - 1]);
            if (v != null) {
                ans += v;
            }
        }

        System.out.println(ans);
    }
}
