import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[1000];

        int n = scanner.nextInt();
        while(n != 0) {
            double ave = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                ave += a[i];
            }
            ave /= n;
            double S = 0;
            for (int i = 0; i < n; i++)
                S += (a[i] - ave) * (a[i] - ave);
            System.out.println(Math.sqrt(S / n));
            n = scanner.nextInt();
        }
    }
}

