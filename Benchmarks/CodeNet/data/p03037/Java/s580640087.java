import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] l = new int[M];
        int[] r = new int[M];

        int lmax = Integer.MIN_VALUE;
        int rmin = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();

            lmax = Math.max(lmax, l[i]);
            rmin = Math.min(rmin, r[i]);
        }

        if (lmax <= rmin) {
            System.out.println(rmin - lmax + 1);
        } else {
            System.out.println(0);
        }

        return;
    }

}