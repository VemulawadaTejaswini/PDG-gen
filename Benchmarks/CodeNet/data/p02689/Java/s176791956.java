import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        int[] c = new int[n];
        for (int i = 0 ; i < m ; i++) {
            if (h[a[i]] > h[b[i]]) {
                c[b[i]]++;
            } else if (h[a[i]] < h[b[i]]) {
                c[a[i]]++;
            } else {
                c[a[i]]++;
                c[b[i]]++;
            }
        }

        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (c[i] == 0) count++;
        }

        System.out.println(count);


    }


}
