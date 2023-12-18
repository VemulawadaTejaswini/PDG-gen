import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] points = new int[n];
        int scNum;

        for (int i = 0; i < n; i++) {
            points[i] = k;
        }

        for (int i = 0; i < q; i++) {
            scNum = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j + 1 != scNum) {
                    points[j]--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (points[i] <= 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }
}