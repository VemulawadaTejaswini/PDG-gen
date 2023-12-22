import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input;
        int i;

        int n = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int[] s = new int[n];
        for (i = 0; i < n; i++) {
            s[i] = Integer.parseInt(input[i]);
        }

        int q = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int[] t = new int[q];
        for (i = 0; i < q; i++) {
            t[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        for (i = 0; i < q; i++) {
            if (binarySearch(s, t[i], 0, n - 1)) count++;
        }

        System.out.println(count);
    }

    public static boolean binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return false;

        int m = (left + right) / 2;
        if (arr[m] < target) return binarySearch(arr, target, m + 1, right);
        else if (arr[m] > target) return binarySearch(arr, target, left, m - 1);
        else return true;
    }
}