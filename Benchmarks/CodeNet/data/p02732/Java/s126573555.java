import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int ai = sc.nextInt();
            a[i] = ai;
        }
        int[] arr = new int[200001];
        for (int i = 1; i <= n; i++) {
            arr[a[i]]++;
        }
        for (int ansindex = 1; ansindex <= n; ansindex++) {
            int[] sums = arr.clone();
            sums[a[ansindex]]--;
            int ans = 0;
            for (int isums = 1; isums <= n; isums++) {
                ans += (sums[isums] * (sums[isums] - 1)) / 2;
            }
            System.out.println(ans);
        }
    }
}