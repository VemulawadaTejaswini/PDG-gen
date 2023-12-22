import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] a = new String[count];
        String[] b = new String[count];
        for (int i = 0; i < count; i++) {
            String tmp = sc.next();
            a[i] = tmp;
            b[i] = tmp;
        }
        a = bubbleSort(a);
        printArray(a);
        System.out.println("Stable");
        b = selectionSort(b);
        printArray(b);
        if (Arrays.equals(a, b)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not Stable");
        }
    }

    private static String[] bubbleSort(String[] a) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1].charAt(1) > a[i].charAt(1)) {
                    String tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    flag = true;
                }
            }
        }
        return a;
    }

    private static void printArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }

    private static String[] selectionSort(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[j].charAt(1) < a[min].charAt(1)) {
                    min = j;
                }
            }
            if (i != min) {
                String tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
        return a;
    }
}