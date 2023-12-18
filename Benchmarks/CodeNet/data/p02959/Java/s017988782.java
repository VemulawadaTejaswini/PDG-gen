import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int hunteredNumber = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] >= b[i]) {
                hunteredNumber += b[i];
            } else {
                hunteredNumber += a[i];
                if (a[i + 1] >= b[i] - a[i]) {
                    hunteredNumber += b[i] - a[i];
                    a[i + 1] -= (b[i] - a[i]);
                } else {
                    hunteredNumber += a[i + 1];
                    a[i + 1] = 0;
                }
            }
        }
        System.out.println(hunteredNumber);
        sc.close();
    }
}