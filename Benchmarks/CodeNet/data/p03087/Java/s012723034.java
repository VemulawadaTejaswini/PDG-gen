import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        final String S = sc.next();

        int[] a = new int[N+1];
        for (int i = 0; i < N; i++) {
            a[i+1] = a[i];
            if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
                a[i+1]++;
            }
        }

        for (int i = 0; i < Q; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            System.out.println(a[--r] - a[--l]);
        }
    }
}
