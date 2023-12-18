import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] p = new int[N];

        for (int i=0; i<N; i++) {
            p[i] = scanner.nextInt();
        }


        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int[] coPy = Arrays.copyOf(p, p.length);
                int tmp = coPy[i];
                coPy[i] = coPy[j];
                coPy[j] = tmp;
                if (isOrderedAsc(coPy)) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    private static boolean isOrderedAsc(int[] p) {
        for (int i=0; i<p.length - 1; i++) {
            if (p[i] > p[i+1]) return false;
        }
        return true;
    }
}