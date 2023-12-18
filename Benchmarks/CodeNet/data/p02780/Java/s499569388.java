import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);
        double[] arr = new double[n];
        String[] line = br.readLine().split(" ", n);
        for (int i = 0; i < n; i++) {
            double x = Integer.parseInt(line[i]);
            arr[i] = x * (x + 1) / 2 / x;
        }
        double max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        double sum = max;
        for (int i = 0; i + k < n; i++) {
            sum += arr[i + k] - arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}