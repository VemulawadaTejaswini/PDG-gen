

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int a = sc.nextInt();
        if (a < 105) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        int start = a;
        if (a % 2 == 0) {
            start = a - 1;
        }

        while (start >= 105) {
            if (calc(start)) {
//                System.out.println(start);
                ans++;
            }
            start = start - 2;
        }
        System.out.println(ans);
    }

    private static boolean calc(int start) {
        int num = start;
        int count = 2;
        Set<Integer> set = new HashSet<>();
        while (num > 1) {
            if (num % count == 0) {
                num = num / count;
                set.add(count);
            } else {
                count++;
            }
        }
        return set.size() == 3;
    }
}
