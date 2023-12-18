import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] player = new int[n];
        for (int i = 0; i < n; i++) {
            player[i] = k;
        }
        // int[] a = new int[q];
        for (int i = 0; i < q; i++) {
            // a[i] = sc.nextInt();
            int a = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j != a - 1) {
                    player[j]--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (player[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

}
