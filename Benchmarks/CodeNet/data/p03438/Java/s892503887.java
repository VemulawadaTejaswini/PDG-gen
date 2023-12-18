import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sa[] = new int[2];
        int b;
        for (int i = 0; i < n; i++) {
            b = sc.nextInt();
            if (a[i] > b) {
                sa[0] += a[i] - b;
            } else {
                sa[1] += b - a[i];
            }
        }

        System.out.println(sa[0] * 2 > sa[1] ? "No" : "Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
