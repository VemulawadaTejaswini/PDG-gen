import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();
        java.util.Arrays.sort(a);

        long ans = 1;
        long limit = 1000000000000000000L;
        for(int i=0; i<n; i++) {
            ans *= a[i];
            if(ans > limit) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(ans);
    }
}
