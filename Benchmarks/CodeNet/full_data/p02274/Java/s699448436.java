import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        long count = mergeSort(A, 0, n);
        System.out.println(count);
    }

    public static long mergeSort(int[] A, int left, int right) {
        long count = 0;
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            count += mergeSort(A, left, mid);
            count += mergeSort(A, mid, right);
            count += merge(A, left, mid, right);
        }
        return count;
    }

    public static long merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        long count = 0;
        for (int k = left; k < right; k++) {
            if (L[i] < R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
                count += n1 - i;
            }
        }

        return count;
    }
}