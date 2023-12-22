import java.util.Scanner;

public class Main {
    static long inversions;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        inversions = 0;
        mergeSort(a, 0, a.length);
        System.out.println(inversions);
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1];
        int[] r = new int[n2];
        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = a[mid + i];
        }
        int i = 0;
        int j = 0;
        boolean addExtra = false; // True if the extra inversions have been added.
        for (int k = left; k < right; k++) {
            if (i < n1 && (j == n2 || l[i] <= r[j])) {
                a[k] = l[i];
                if (i > 0 && !addExtra) inversions += j;
                i++;
                addExtra = false;
            } else {
                a[k] = r[j];
                if (i < n1) {
                    inversions++;
                    if (i > 0 && !addExtra) inversions += j;
                    addExtra = true;
                }
                j++;
            }
        }
    }
}

