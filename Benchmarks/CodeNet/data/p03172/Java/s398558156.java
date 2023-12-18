import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int N = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(getWays(arr, N));

    }

    public static long getWays(int arr[], int N) {
        long ans[][] = new long[arr.length][N + 1];
        long sumarr[][] = new long[arr.length][N + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            long sum = sumarr[i][0];

            for (int j = 0; j < ans[0].length; j++) {
                if (i == arr.length - 1) {
                    if (j <= arr[i]) {

                        ans[i][j] = 1;
                        sum = (sum + ans[i][j]) % 1000000007;

                    }
                    sumarr[i][j] = sum % 1000000007;

                } else {
                    if (j == 0) {
                        ans[i][j] = 1;
                        sumarr[i][j] = 1;
                        sum += ans[i][j];
                        continue;
                    }

                    if (j - arr[i] - 1 >= 0) {
                        ans[i][j] = (sumarr[i + 1][j] - sumarr[i + 1][j - arr[i] - 1]) % 1000000007;

                    } else {
                        ans[i][j] = sumarr[i + 1][j] % (1000000007);

                    }
                    sum = (sum + ans[i][j]);
                    sumarr[i][j] = sum % (1000000007);

                }

            }
        }

        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < ans[0].length; j++) {
        // System.out.print(ans[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println("Break");
        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < ans[0].length; j++) {
        // System.out.print(sumarr[i][j] + " ");
        // }
        // System.out.println();
        // }

        return ans[0][N] % 1000000007;
    }
}
