import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        sc.nextLine();

        int m = sc.nextInt();
        sc.nextLine();
        int t[] = new int[m];
        for (int i = 0; i < m; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();

        if (m > n) {
            System.out.println("NO");
            System.exit(0);
        }

        for (int i = 0; i < m; i++) {
            int judge = 0;
            for (int j = 0; j < n; j++) {
                if (t[i] == d[j]) {
                    d[j] = 0;
                    judge = 1;
                    break;
                }
            }
            if (judge == 0) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
