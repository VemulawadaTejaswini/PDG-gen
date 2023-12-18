import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long sum = 0;
        long unsum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] - (a[0] + i);
            unsum += Math.abs(a[i] - (a[0] + i));
        }

        if (sum == 0) {
            System.out.println(unsum);
            return;
        }

        long l, r;
        if (sum > 0) {
            r = sum / n;
            l = r + 1;
        } else {
            l = sum / n;
            r = l - 1;
        }

        long unsuml = 0;
        long unsumr = 0;
        for (int i = 0; i < n; i++) {
            unsuml += Math.abs(a[i] - (a[0] + l + i));
            unsumr += Math.abs(a[i] - (a[0] + r + i));
        }
        System.out.println(Math.min(unsuml, unsumr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
