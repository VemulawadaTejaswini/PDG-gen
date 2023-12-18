import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        final String S = sc.next();

        int[] a = new int[N+1];
        for (int i = 0; i  < N; i++) {
            if (i+1 < N && S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
                a[i+1] = a[i] + 1;
            } else {
                a[i+1] = a[i];
            }
        }

        for (int i = 0; i < Q; i++) {
            int l = Integer.valueOf(sc.next());
            int r = Integer.valueOf(sc.next());
            System.out.println(a[--r] - a[--l]);
        }
    }
}
