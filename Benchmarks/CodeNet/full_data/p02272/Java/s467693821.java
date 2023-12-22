import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        mergeSort(s, 0, n);
        printArray(s);
        System.out.println(count);
    }

    static void mergeSort(int[] s, int left, int right) {
        if (left + 1 < right) { // ??????1?????\???????´????????????¶????????£????????£??????????????????
            int mid = (left + right) / 2;
            mergeSort(s, left, mid);
            mergeSort(s, mid, right);
            merge(s, left, mid, right);
        }
    }

    private static void merge(int[] s, int left, int mid, int right) {
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid + 1];
        for (int i = 0; i < L.length - 1; i++) {
            L[i] = s[left + i];
        }
        L[L.length - 1] = Integer.MAX_VALUE;
        for (int i = 0; i < R.length - 1; i++) {
            R[i] = s[mid + i];
        }
        R[R.length - 1] = Integer.MAX_VALUE;
        for (int i = 0, j = 0, k = left; k < right; k++) {
            count++;
            if (L[i] <= R[j]) {
                s[k] = L[i];
                i++;
            } else {
                s[k] = R[j];
                j++;
            }
        }
    }

    private static void printArray(int/*or long*/[] array) {
        if (array.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}