import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    static int cnt = 0;

    static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        System.arraycopy(A, left, L, 0, n1);
        System.arraycopy(A, mid, R, 0, n2);
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            cnt++;
        }
    }

    static void mergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cnt = 0;
            int n = Integer.parseInt(in.readLine());
            int[] A = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            mergeSort(A, 0, n);

            System.out.println(Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

