import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(Math.abs(a[0] - w));
            return;
        }

        int last = a[n - 1];
        int evlast = a[n - 2];
        System.out.println(Math.max(Math.abs(last - evlast), Math.abs(w - last)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
