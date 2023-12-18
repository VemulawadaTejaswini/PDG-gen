
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] as = new int[n];
        Boolean[][] fdp = new Boolean[k + 1][2];
        fdp[0][0] = false;
        fdp[0][1] = false;
        for (int i = 0; i < n; i++) {
            as[i] = scanner.nextInt();
        }
        for (int i = 0; i < as[0]; i++) {
            fdp[i][1] = false;
        }
        System.out.println(calculate(fdp, as, k, 0) ? "First" : "Second");
    }

    private static boolean calculate(Boolean[][] fdp, int[] as, int k, int order) {
        if (fdp[k][order] != null) {
            return fdp[k][order];
        }
        fdp[k][order] = false;
        for (int i = 0; i < as.length; i++) {
            if (k - as[i] >= 0) {
                fdp[k][order] |= !calculate(fdp, as, k - as[i], (order + 1) % 2);
              	if (fdp[k][order]) {
                    break;
                }
            }
        }
        return fdp[k][order];
    }
}
