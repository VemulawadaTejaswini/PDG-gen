import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            min = Math.min(min, a);
            int mod = a % min;
            if (mod != 0) set.add(mod);
        }

        while (set.size() > 1 && min != 1) {
            Set<Integer> tmp = new HashSet<>();
            for (Integer i : set) {
                int res = i % min;
                if (res != 0 ) {
                    tmp.add(res);
                    min = Math.min(min, res);
                }
            }
            set = tmp;
        }

        if (min == 1 || set.size() == 0) {
            System.out.println(min);
        }  else {
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}
