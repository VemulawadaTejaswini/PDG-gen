import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int ans = Integer.MAX_VALUE;
        if (R - L >= 2019) {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = L; i < R; i++) {
            for (int j = L + 1; j <= R; j++) {
                ans = Math.min(ans, (int)((long)(i * j) % 2019));
            }
        }
        System.out.println(ans);
    }
}