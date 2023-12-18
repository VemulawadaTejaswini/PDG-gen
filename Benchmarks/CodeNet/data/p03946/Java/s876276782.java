import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int t = Integer.parseInt(first[1]);
        String[] line = br.readLine().split(" ", n);
        int[] arr = new int[n];
        int max = 0;
        int[] maxes = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = Integer.parseInt(line[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
            maxes[i] = max;
        }
        max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int value = maxes[i] - arr[i];
            if (max == value) {
                count++;
            } else if (max < value) {
                max = value;
                count = 1;
            }
        }
        System.out.println(count);
    }
}