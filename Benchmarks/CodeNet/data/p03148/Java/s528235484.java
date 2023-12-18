import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[] {sc.nextInt(), sc.nextInt()};
        }
        Arrays.sort(arr, (a1, a2) -> a2[1] - a1[1]);

        long sum = 0;
        long kind = 0;

        int[] countKind = new int[n+1];
        for (int i = 0; i < k; i++) {
            sum += arr[i][1];   // summing delicious
            if (countKind[arr[i][0]] == 0) kind++;
            countKind[arr[i][0]]++;
        }

        long ans = kind * kind + sum;
        int idx = k-1;
        for (int i = k; i < n; i++) {
            if (countKind[arr[i][0]] == 0) {
                while (countKind[arr[idx][0]] == 1) idx--;

                countKind[arr[i][0]]++;
                countKind[arr[idx][0]]--;
                kind++;

                sum = sum - arr[idx--][1] + arr[i][1];
                ans = Math.max(ans, sum + kind * kind);
            }
        }
        System.out.println(ans);
    }
}