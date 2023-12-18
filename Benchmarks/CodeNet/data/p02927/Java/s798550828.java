import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        long ans = 0;
        for (int j = 1; j < m; j++) {
            for (int i = 22; i <= d; i++) {
                int d1 = i % 10;
                int d2 = i / 10;
                if (d1 * d2 == j) {
                    ans++;

                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
