import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();

        int x1[] = new int[n];
        int x2[] = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = x1[i];
        }

        Arrays.sort(x2);

        int midl = x2[n / 2 - 1];
        int midr = x2[n / 2];

        for (int i = 0; i < n; i++) {
            System.out.println((x1[i] <= midl) ? midr : midl);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
