import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] s = new int[count];
        for (int i = 0; i < count; i++) {
            s[i] = sc.nextInt();
        }
        selectionSort(s);
    }

    private static int[] selectionSort(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
                count++;
            }
        }
        printArray(a);
        System.out.println(count);
        return a;
    }

    private static void printArray(int[] array) {
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