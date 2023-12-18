import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int arr[][] = new int[rows][3];
        int ans[][] = new int[rows][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
                ans[i][j] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                ans[i][j] = -1;
            }
        }
        System.out.println(maxVaca(arr, 1, -1, ans));
        

    }
    public static int maxVaca(int arr[][], int i, int j, int ans[][]) {

        if (i > arr.length - 1) {
            // ans[i][j] = 0;
            return 0;
        }
        if (ans[i][j + 1] != -1) {

            return ans[i][j];
        }

        int max = Integer.MIN_VALUE;
        for (int k = 0; k < arr[0].length; k++) {
            if (k != j) {
                max = Math.max(arr[i][k] + maxVaca(arr, i + 1, k, ans), max);
            }

        }
        ans[i][j + 1] = max;
        return ans[i][j + 1];

    }

}