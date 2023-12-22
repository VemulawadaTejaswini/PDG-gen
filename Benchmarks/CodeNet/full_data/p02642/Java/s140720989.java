import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                map.put(a[i] , map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        Arrays.sort(a);
        int[] b = new int[1000003];
        int c = 0;

        for (int i = 0 ; i < n ; i++) {
            int x = a[i];
            Set<Integer> set = new HashSet<>();
            boolean flg = true;
            for (int j = 2 ; j <= Math.sqrt(x) ;j++) {
                if (x % j == 0) {
                    if (map.containsKey(j)) {
                        flg = false;
                    }
                    if (map.containsKey(x / j)) {
                        flg = false;
                    }
                }

            }
            if (map.get(a[i]) > 1) {
                flg = false;
            }
            if (flg) {
                c++;
            }
        }
        if (map.size() == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(c);

    }

}