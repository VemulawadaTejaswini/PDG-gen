import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);
        int cp = n / 2;
        int center = b[cp];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(a[i] - (center - cp + i));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
