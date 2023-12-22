import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] s = new int[count];
        for (int i = 0; i < count; i++) {
            s[i] = sc.nextInt();
        }
        bubbleSort(s);
    }

    private static int[] bubbleSort(int[] a) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    flag = true;
                    count++;
                }
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