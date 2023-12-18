import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            // main.solveA(sc);
            main.solveB(sc);

        }
    }

    void solveB(Scanner sc) {
        char[] s = sc.next().toCharArray();
        int[] count = new int['z' - 'a' + 1];
        if (s.length == 1) {
            System.out.println("-1 -1");
            return;
        } else if (s.length == 2) {
            if (s[0] == s[1]) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        for (int i = 0; i < s.length; i++) {
            int c = s[i] - 'a';
            count[c]++;
            if (i < 2)
                continue;
            for (int cou : count) {
                if (cou >= 2) {
                    System.out.println(i - 1 + " " + (i + 1));
                    return;
                }
            }
            int m = s[i - 2] - 'a';
            count[m]--;
        }
        System.out.println("-1 -1");

    }

    void solveA(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int sum = 0;
            for (int num : list) {
                sum += Math.pow(num - i, 2);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }

}
