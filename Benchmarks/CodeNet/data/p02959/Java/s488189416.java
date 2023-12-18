import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int count = 0;
        int carry = 0;
        for (int i = n; i >= 0; i--) {
            int capa = carry;
            if (i > 0) capa += b[i-1];
            if (capa >= a[i]) {
                count += a[i];
                carry = a[i] - capa;
            } else {
                count += capa;
                carry = 0;
            }
        }

        System.out.println(count);
    }
}