import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] permArray;
    static int count = 0;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            q[i] = sc.nextInt();
        }
        int array[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
            array[i] = i + 1;
        }
        int d = 1;
        for (int i = 1 ; i <= n ; i++) {
            d *= i;
        }
        permArray = new int[d][n];

        permutation(array);

        int pc = countPerm(p);
        int qc = countPerm(q);
        System.out.println(Math.abs(pc - qc));

    }

    private static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            for (int i = 0 ; i < n ; i++) {
                permArray[count][i] = perm[i];
            }
            count++;
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }

    private static int countPerm(int[] p) {
        int num = 0;
        for (int i = 0 ; i < permArray.length ; i++) {
            boolean flg = true;
            for (int j = 0 ; j < n ; j++) {
                if (p[j] != permArray[i][j]) flg  =false;
            }
            if (flg) num = i;
        }
        return num;
    }


    /*
     * for Debag
     */
    private static void procPerm(int[] perm) {
        // Use the perm[] here.
        System.out.println(Arrays.toString(perm));
    }

}
