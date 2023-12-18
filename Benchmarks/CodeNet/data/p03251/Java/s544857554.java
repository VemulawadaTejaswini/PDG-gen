import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] xA = new int[n];
        int[] yA = new int[m];

        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            yA[i] = sc.nextInt();
        }

        Arrays.sort(xA);
        Arrays.sort(yA);

        boolean _isfFlag = false;

        for (int z = xA[n-1]+1; z <= yA[0]; z++) {
            if (z > x && z <= y) {
                _isfFlag = true;
                break;
            }
        }

        if (_isfFlag) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}
