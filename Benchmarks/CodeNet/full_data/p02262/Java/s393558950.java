import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
    static StringBuilder builder = new StringBuilder();
 
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        final int n = Integer.parseInt(reader.readLine());
        final int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        shellSort(a, n);
        for (int i = 0; i < n; ++i) {
            builder.append(a[i]).append("\n");
        }
        System.out.print(builder);
    }
 
    private static void shellSort(int[] a, int n) {
        ArrayList<Integer>nums = new ArrayList<Integer>();
        int m = 0;
        for (int i = 1; i <= n; i = i * 3 + 1) {
            //g[m] = i;
        	nums.add(m,i);
            m++;
        }
 
        builder.append(m).append("\n");
 
        m--;
        int cnt = 0;
        for (int i = m; i >= 0; i--) {
            if (i != m)
            builder.append(" ");
            builder.append(nums.get(i));
            cnt += insertionSort(a, n, nums.get(i));
        }
        builder.append("\n").append(cnt).append("\n");
    }
 
    private static int insertionSort(int[] a, int n, int g) {
        int cnt = 0;
        for (int i = g; i < n; ++i) {
            final int key = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > key) {
                a[j + g] = a[j];
                j = j - g;
                cnt++;
            }
            a[j + g] = key;
        }
        return cnt;
    }
}