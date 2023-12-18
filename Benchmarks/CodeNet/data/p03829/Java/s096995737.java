import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        long pos = x[0];
        long ans = 0;
        for (int i = 1; i < n; i++) {
            long next = x[i];
            if ((next - pos) * a > b) {
                ans += b;
            } else {
                ans += (next - pos) * a;
            }
            pos = next;
        }
        System.out.println(ans);

        sc.close();
    }
}