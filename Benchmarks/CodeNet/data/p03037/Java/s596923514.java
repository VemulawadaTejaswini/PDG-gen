import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int lmax = Integer.MIN_VALUE;
        int rmin = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            lmax = Math.max(lmax, l);
            rmin = Math.min(rmin, r);
        }

        sc.close();

        System.out.println(Math.abs(lmax - rmin) + 1);

    }
}