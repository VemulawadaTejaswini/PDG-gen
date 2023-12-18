import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        int b[][] = new int[n][2];
        boolean used[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }

        Arrays.sort(a, (o1, o2) -> (o2[0] - o1[0] == 0) ? o2[1] - o1[1] : o2[0] - o1[0]);
        Arrays.sort(b, (o1, o2) -> (o2[0] - o1[0] == 0) ? o2[1] - o1[1] : o2[0] - o1[0]);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (used[j]) {
                    continue;
                }
                if (a[i][0] < b[j][0] && a[i][1] < b[j][1]) {
                    cnt++;
                    used[j] = true;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
