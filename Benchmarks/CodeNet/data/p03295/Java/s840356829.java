import java.util.Arrays;
import java.util.Scanner;

//D - Islands War
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] d = new int[m][2];
        for (int i = 0; i < m; i++) {
            d[i][0] = sc.nextInt();
            d[i][1] = sc.nextInt();
        }
        Arrays.sort(d, (a, b) -> a[1] - b[1]);
        int ans = 1;
        int end = d[0][1];
        for (int i = 1; i < d.length; i++)
            if (d[i][0] >= end) {
                ans++;
                end = d[i][1];
            }
        System.out.println(ans);
        sc.close();
    }
}
