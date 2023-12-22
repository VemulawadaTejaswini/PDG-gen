import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        //int[] p = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            //p[i] = sc.nextInt();
            set.add(sc.nextInt());
        }

        if (!set.contains(x)) {
            System.out.println(x);
            return;
        }

        int can1 = x - 1;
        int can2 = x + 1;
        while (true) {
            if (!set.contains(can1)) {
                System.out.println(can1);
                return;
            }
            if (!set.contains(can2)) {
                System.out.println(can2);
                return;
            }
            can1--;
            can2++;
        }
    }

}