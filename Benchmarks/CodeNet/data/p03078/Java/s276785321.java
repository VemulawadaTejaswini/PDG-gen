import java.util.*;

public class Main {

    private int X, Y, Z;
    private Long[] A;
    private Long[] B;
    private Long[] C;
    private int K;

    /* Set ups */
    private Main() {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        K = sc.nextInt();
        A = new Long[X];
        B = new Long[Y];
        C = new Long[Z];
        for (int x = 0; x < X; x += 1) {
            A[x] = Long.parseLong(sc.next());
        }
        for (int y = 0; y < Y; y += 1) {
            B[y] = Long.parseLong(sc.next());
        }
        for (int z = 0; z < Z; z += 1) {
            C[z] = Long.parseLong(sc.next());
        }
    }

    private void solve() {
        Long[] XY = new Long[X * Y];
        int index1 = 0;
        for (int x = 0; x < X; x += 1) {
            for (int y = 0; y < Y; y += 1) {
                XY[index1] = A[x] + B[y];
                index1 += 1;
            }
        }
        Arrays.sort(XY, Collections.reverseOrder());

        Long[] XYKZ = new Long[K * Z];
        int index2 = 0;
        for (int k = 0; k < K; k += 1) {
            for (int z = 0; z < Z; z += 1) {
                XYKZ[index2] = XY[k] + C[z];
                index2 += 1;
            }
        }
        Arrays.sort(XYKZ, Collections.reverseOrder());

        for (int k = 0; k < K; k += 1) {
            System.out.println(XYKZ[k]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

}
