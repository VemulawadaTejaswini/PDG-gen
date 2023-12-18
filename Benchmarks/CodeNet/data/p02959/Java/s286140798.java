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
        for (int i = 0; i < n+1; i++) {
            int capa = carry;
            if (i < n) capa += b[i];
            if (capa >= a[i]) {
                count += a[i];
                if (i < n) carry = Math.min(capa - a[i], b[i]);
            } else {
                count += capa;
                carry = 0;
            }
        }

        System.out.println(count);
    }
}