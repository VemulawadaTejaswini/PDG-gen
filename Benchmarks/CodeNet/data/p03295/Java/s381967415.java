import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ab = new int[m][2];
        for(int i = 0;i < m;i++) {
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }

        Arrays.sort(ab, (l, r) -> Integer.compare(l[1], r[1]));

        int count = 0;
        int tmpR = ab[0][1];
        for(int i = 1;i < m;i++) {
            int tmpL = ab[i][0];
            if(tmpR > tmpL) count++;
            else tmpR = ab[i][1];
        }

        int ans = m - count;
        System.out.println(ans);
    }
}
