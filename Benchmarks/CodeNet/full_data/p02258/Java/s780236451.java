import java.util.Scanner;

/**
 * @Author: zhengtiantian
 * @Date: 19-3-28 下午3:58
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] money = new int[n];
            for (int i = 0; i < n; i++) {
                money[i] = cin.nextInt();
            }
            int minv = money[0];
            int maxv = -2000000000;
            for (int i = 1; i < n; i++) {
                maxv = Math.max(maxv, money[i] - minv);
                minv = Math.min(minv, money[i]);
            }
            System.out.println(maxv);
        }
    }
}

