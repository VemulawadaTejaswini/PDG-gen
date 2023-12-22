import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int pivot = partition(a, 0, n-1);
        System.out.println(printArray(a, pivot));
    }

    private static int partition(int[] a, int l, int r) {
        int x = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] <= x) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[r] = a[i+1];
        a[i+1] = x;
        return i+1;
    }

    static String printArray(int[] a, int pivot) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i == pivot) {
                sb.append("[").append(a[i]).append("]");
            } else {
                sb.append(a[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

