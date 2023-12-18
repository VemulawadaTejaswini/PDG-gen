import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a == b) {
            System.out.println(a);
            System.exit(0);
        }

        int k = s.nextInt();
        boolean f = true;
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            if (i >= b) {
                f = false;
                break;
            }
            set.add(a + i);

        }
        if (f) {
            for (int i = k - 1; i >= 0; i--) {
                if (b - i < 0) {
                    break;
                }
                set.add(b - i);
            }

        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
