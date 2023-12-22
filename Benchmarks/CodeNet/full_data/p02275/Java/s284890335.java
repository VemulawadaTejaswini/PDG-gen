import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        countingSort(a, b, max);
        printArray(b);
    }

    private static void countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k + 1];
        for (int e : a) {
            c[e]++;
        }
        for (int i = 1; i < k + 1; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            c[a[i]]--;
            b[c[a[i]]] = a[i];
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