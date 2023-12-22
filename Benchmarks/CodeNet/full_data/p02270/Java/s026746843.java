import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nk = in.readLine();
        String[] nkSplit = nk.split(" ");
        int n = Integer.parseInt(nkSplit[0]);
        int k = Integer.parseInt(nkSplit[1]);
        int[] packages = new int[n];
        int max = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int w = Integer.parseInt(in.readLine());
            packages[i] = w;
            if (w > max) {
                max = w;
            }
            total += w;
        }
        int minMax = binarySearch(max, total, k, packages);
        System.out.println(minMax);
    }

    private static boolean loadSuccessful(int maxLoad, int k, int[] packages) {
        int currentWeight = 0;
        for (int w : packages) {
            if (currentWeight + w <= maxLoad) {
                currentWeight += w;
            } else {
                k--;
                currentWeight = w;
            }

            if (k == 0) {
                return false;
            }
        }
        return true;
    }

    private static int binarySearch(int left, int right, int k, int[] packages) {
        int mid = (left + right) / 2;
        while (left <= right) {
            if (loadSuccessful(mid, k, packages)) {
                right = mid - 1;
                mid = (right + left) / 2;
            } else {
                left = mid + 1;
                mid = (right + left) / 2;
            }
        }
        return mid + 1;
    }
}

