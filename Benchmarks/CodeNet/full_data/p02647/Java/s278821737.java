

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int k = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            final int[] res = new int[n];
            Arrays.fill(res, 1);
            for (int j = 0; j < n; j++) {
                for (int t = Math.max(0, j - arr[j]); t <= Math.min(n - 1, j + arr[j]); t++) {
                    if (t == j) {
                        continue;
                    } else {
                        res[t]++;
                    }
                }
            }
            if (Arrays.equals(res, arr)) {
                break;
            } else {
                arr = res;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
