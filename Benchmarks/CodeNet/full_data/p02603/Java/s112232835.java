import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int yen = 1000;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                yen += (a[i + 1] - a[i]) * (yen / a[i]);
            }
        }
        System.out.println(yen);
    }

}
