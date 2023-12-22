import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] sorted = countingSort(arr, max);

        StringBuilder sb = new StringBuilder("");
        sb.append(sorted[0]);
        for (int i = 1; i < sorted.length; i++) {
            sb.append(" ").append(sorted[i]);
        }
        System.out.println(sb.toString());
    }

    public static int[] countingSort(int[] arr, int k) {
        int length = arr.length;
        int[] count = new int[k + 1];
        int[] ret = new int[arr.length];
        int i;
        for (i = 0; i < length; i++) {
            count[arr[i]]++;
        }
        for (i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }
        for (i = length - 1; i >= 0; i--) {
            ret[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return ret;
    }
}