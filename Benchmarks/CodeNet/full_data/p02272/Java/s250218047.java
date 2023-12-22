import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int counter = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = inp.nextInt();

        int[] list = new int[total];

        for (int k = 0; k < total; k++) {
            list[k] = inp.nextInt();
        }

        merge_sort(list, 0, total);

        StringBuilder pInt = new StringBuilder();
        
        int place = 0;
        for(int n : list) {
            if (place != 0) {
                pInt.append(" ").append(n);

            } else {
                pInt.append(n);
            }

            place++;
        }

        System.out.println(pInt);

        System.out.println(counter);
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1+1];
        int[] r = new int[n2+1];

        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }

        for (int i = 0; i < n2; i++) {
            r[i] = a[mid + i];
        }

        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = left; k < right; k++) {
            if (l[i] <= r[j]) {
                a[k] = l[i++];
            } else {
                a[k] = r[j++];
            }
            counter++;
        }
    }

    public static void merge_sort(int[] a, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            merge_sort(a, left, mid);
            merge_sort(a, mid, right);
            merge(a, left, mid, right);
        }
    }
}
