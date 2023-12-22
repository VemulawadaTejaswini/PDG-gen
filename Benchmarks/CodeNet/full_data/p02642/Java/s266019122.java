import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[1000003];
        int c = 0;
        Set<Integer> map = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            int x = a[i];
            Set<Integer> set = new HashSet<>();
            for (int j = 1 ; j <= Math.sqrt(x) ;j++) {
                if (x % j == 0) {
                    set.add(j);
                    set.add(x/j);
                }
            }
            boolean flg = true;
            for (int t : set) {
                if (map.contains(t)) {
                    flg = false;
                }
            }
            if (flg) {
                c++;
            }

            map.add(x);
        }
        if (map.size() == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(c);

    }

}
