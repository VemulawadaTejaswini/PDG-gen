import java.util.*;

public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0 ;i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] b = new int[q];
        int[] c = new int[q];
        for (int i = 0 ;i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();

            int result = 0;
            for (int j = 0 ;j < n; j++) {

                if (a[j] == b[i]) {
                    a[j] = c[i];
                }
                result += a[j];
            }
            System.out.println(result);
        }
    }
}
