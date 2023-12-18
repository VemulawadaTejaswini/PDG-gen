import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        int a[] = new int[n];
        StringTokenizer t = new StringTokenizer(input.readLine());
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(t.nextToken());
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            count += zeroSumTimes(a, n, i);
        }
        System.out.println(count);
    }

    static int zeroSumTimes(int a[], int n, int start) {
        int sum = 0, count = 0;
        for (int i=start; i<n; i++) {
            sum += a[i];
            if (sum == 0) count++;
        }
        return count;
    }
}
