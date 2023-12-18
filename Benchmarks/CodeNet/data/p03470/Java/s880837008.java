import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    // kagami mochi
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Integer[] mochies = new Integer[n];
        for (int i = 0; i < n; i++) {
            mochies[i] = Integer.valueOf(sc.nextLine());
        }

        Arrays.sort(mochies, Comparator.reverseOrder());

        int cnt = 1;
        for (int i = 0; i < mochies.length - 1; i++) {
            if (!mochies[i].equals(mochies[i + 1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
