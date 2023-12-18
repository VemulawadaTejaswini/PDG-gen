mport java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (min > a[i]) {
                min = a[i];
                minIndex = i;
            }
        }

        int alive = n;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (a[i] > 0 && i != minIndex) {
                    a[i] = a[i] % min;
                    if (a[i] <= 0) {
                        alive--;
                    }
                    if (a[i] > 0 && min > a[i]) {
                        min = a[i];
                        minIndex = i;
                    }

                    if (alive == 1) {
                        System.out.print(a[minIndex]);
                        return;
                    }
                }
            }
        }
    }

}