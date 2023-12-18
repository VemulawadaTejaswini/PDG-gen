import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];

        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(x);

        int ans = 0;

        if (n >= m) {
            System.out.println(ans);
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < m - 1; i++) {
            list.add(x[i + 1] - x[i]);
        }

        Collections.sort(list, Comparator.reverseOrder());

        for (int i = 0; i < n - 1; i++) {
            list.remove(0);
        }

        for (int num : list) {
            ans += num;
        }

        System.out.println(ans);
    }
}
