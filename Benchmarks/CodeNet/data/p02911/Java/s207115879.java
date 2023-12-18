import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = k;
        }

        int[] answers = new int[q];
        for (int i = 0; i < q; i++) {
            answers[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                if (answers[i] != j+1) {
                    points[j]--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (points[i] < 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}