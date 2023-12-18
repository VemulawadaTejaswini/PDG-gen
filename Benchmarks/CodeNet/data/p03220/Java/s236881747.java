import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tem = (int) (t-(h[i] * 0.006));
            if (Math.abs(tem - a) < min) {
                min = Math.abs(tem - a);
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}
