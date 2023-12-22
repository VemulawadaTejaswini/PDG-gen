import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a, n);
        sc.close();
    }

    private static void bubbleSort(int[] a, int n) {
        int exchange = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; i--) {
                if (a[i] < a[i - 1]) {
                    int ai = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = ai;
                    exchange++;
                    flag = true;
                }
            }
        }
        print(a, n, exchange);
    }

    private static void print(int[] a, int n, int exchange) {
        String[] aStr = new String[n];
        for (int i = 0; i < n; i++) {
            aStr[i] = String.valueOf(a[i]);
        }
        System.out.println(String.join(" ", aStr));
        System.out.println(exchange);
    }
}
