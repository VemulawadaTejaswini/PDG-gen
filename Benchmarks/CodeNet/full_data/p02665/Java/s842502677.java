import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long ans = 0;

        int array[] = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            array[i] = sc.nextInt();
        }

        int max[] = new int[n];
        max[0] = 1;
        //チェックと計算
        for (int i = 0; i < n; i++) {
            if (array[i] > max[i] || array[0] > 0) {
                System.out.println(-1);
                return;
            }

            if (i == n - 1) {
                break;
            }

            max[i + 1] = max[i] * 2 - array[i + 1];
        }

        int sum = 0;

        for (int i = 0; i < n + 1; i++) {

            if (i == 0) {
                ans += array[n];
                sum += array[n];
                continue;
            }

            if (max[n - i] >= sum + array[n - i]) {
                sum += array[n - i];
                ans += sum;
            } else{
                ans += max[n - i] + array[n - i];
            }
        }

        System.out.println(ans);

        sc.close();
    }

}