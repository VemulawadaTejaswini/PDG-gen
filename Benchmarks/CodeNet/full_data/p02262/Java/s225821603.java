import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        a = shellSort(a);
        System.out.println(count);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] shellSort(int[] a) {
        int[] gaps = new int[]{8, 4, 2, 1};
        for (int i = 0; i < gaps.length; i++) {
            a = insertionSort(a, gaps[i]);
        }
        System.out.println(gaps.length);
        printArray(gaps);
        return a;
    }

    private static int[] insertionSort(int[] a, int gap) {
        for (int i = gap; i < a.length; i += gap) {
            int target = a[i];
            int j = i - gap;
            while (j >= 0 && a[j] > target) {
                a[j + gap] = a[j];
                j -= gap;
                count++;
            }
            a[j + gap] = target;
        }
        return a;
    }

    private static void printArray(int/*or long*/[] array) {
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