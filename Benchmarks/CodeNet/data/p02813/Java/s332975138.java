import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    int[] perm;
    boolean[] used;
    int[] p;
    int[] q;
    int count = 0;
    int pcount = -1;
    int qcount = -1;

    private void run() {
        int n = sc.nextInt();
        p = new int[n];
        q = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        perm = new int[n];
        used = new boolean[n];
        permutation(0,n);
    }
    void permutation(int pos, int n) {
        if (pos == n) {
            count++;
            if (Arrays.equals(p, perm)) pcount = count;
            if (Arrays.equals(q, perm)) qcount = count;

            if (pcount > 0 && qcount > 0) {
                System.out.println(Math.abs(pcount - qcount));
                System.exit(0);
            }

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                perm[pos] = i+1;
                used[i] = true;
                permutation(pos+1, n);
                used[i] = false;
            }
        }
    }
}
