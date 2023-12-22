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
        int minPrice = a[0];
        int maxPrice = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > maxPrice) {
                maxPrice = a[i];
            }
            if (minPrice == maxPrice && a[i] < minPrice) {
                minPrice = a[i];
                maxPrice = a[i];
            } else if (a[i] < maxPrice) {
                yen += (maxPrice - minPrice) * (yen / minPrice);
                minPrice = a[i];
                maxPrice = a[i];
            }
        }
        yen += (maxPrice - minPrice) * (yen / minPrice);
        System.out.println(yen);
    }

}
