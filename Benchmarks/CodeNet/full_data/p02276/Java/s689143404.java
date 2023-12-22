import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ", 0);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        partition(nums, 0,n - 1);
    }

    static void printArray(int[] a, int index) {
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                System.out.print('[');
                System.out.print(a[i]);
                System.out.print(']');
            } else {
                System.out.print(a[i]);
            }

            if (i != a.length - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }

    static int[] swap(int[] a, int i1, int i2) {
        int tmp = a[i1];
        a[i1] = a[i2];
        a[i2] = tmp;
        return a;
    }

    static void partition(int[] a, int p, int r) {
        int val = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= val) {
                i++;
                a = swap(a, i, j);
            }
        }
        a = swap(a, i + 1, r);
        printArray(a, i + 1);
        return;
    }
}


