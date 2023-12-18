import java.util.Scanner;

public class Main {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int h[] = new int[n];
        int ma[] = new int[n];

        for (int i = 0; i<n; i++ ) {
            h[i] = sc.nextInt();
            ma[i] = 0;
        }

        for (int j= 0; j < m; j++ ) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            ma[a] = Math.max(ma[a], h[b]);
            ma[b] = Math.max(ma[b], h[a]);
        }

        int count = 0;

        for (int k= 0; k<n; k++ ) {
            if (h[k] > ma[k]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
