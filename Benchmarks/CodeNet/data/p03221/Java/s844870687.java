import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc 113 C
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] list = new int[m][3];

        for (int i = 0; i < m; i++) {
            // 県
            list[i][0] = sc.nextInt();
            // 年
            list[i][1] = sc.nextInt();
            // 出力順
            list[i][2] = i;
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a[1]));

        String[] ans = new String[m];
        int[] count = new int[n];

        for (int i = 0; i < m; i++) {
            int[] t = list[i];
            count[t[0] - 1]++;
            ans[t[2]] = String.format("%06d%06d", t[0], count[t[0] - 1]);
        }

        for (String v: ans
             ) {
            System.out.println(v);
        }
    }
}