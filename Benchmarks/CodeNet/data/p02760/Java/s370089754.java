

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        List<Integer> bingo = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            bingo.add(sc.nextInt());
        }
        int n = sc.nextInt();
        boolean[] ans = new boolean[9];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int index = bingo.indexOf(num);
            if (index < 0) {
                continue;
            }
            ans[index] = true;
            if (isBingo(ans)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    private static boolean isBingo(boolean[] ans) {
        return ans[0] && ans[1] && ans[2] ||
                ans[3] && ans[4] && ans[5] ||
                ans[6] && ans[7] && ans[8] ||
                ans[0] && ans[3] && ans[6] ||
                ans[1] && ans[4] && ans[7] ||
                ans[2] && ans[5] && ans[8] ||
                ans[0] && ans[4] && ans[8] ||
                ans[2] && ans[4] && ans[6];

    }

}
