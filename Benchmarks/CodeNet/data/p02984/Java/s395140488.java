import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int[] x = new int[n];
        int[] a = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] =  Integer.parseInt(sc.next());
            s += a[i];
        }

        x[0] = s;
        for (int i = 1; i < n; i+=2) {
            x[0] -= 2 * a[i];
        }

        for(int i = 0; i < n - 1; i++) {
            x[i + 1] = 2 * a[i] - x[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(x[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}