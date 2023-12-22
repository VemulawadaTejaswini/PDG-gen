import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        long n = Long.parseLong(line[0]);
        int x = Integer.parseInt(line[1]), m = Integer.parseInt(line[2]);

        bw.write(Long.toString(solve(n, x, m)));

        bw.close();
        br.close();
    }

    private static long solve(long n, int x, int m) {
        long[] prefix = new long[m + 1];
        int arr[] = new int[m],  a = x % m, index = 0;
        Arrays.fill(arr, -1);

        while (arr[a] == -1) {
            arr[a] = index++;
            prefix[index] = prefix[index - 1] + a;
            a = (int)((long)a * a % m);
        }

        int start = arr[a], end = index;

        return n / (end - start) * (prefix[end] - prefix[start]) + prefix[Math.max((int)(n % (end - start)), start)];
    }
}
