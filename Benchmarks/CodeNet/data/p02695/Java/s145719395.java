import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        int[][] abcd = new int[q][4];
        for (int i = 0; i < q; i++) {
            abcd[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int max = 0;
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }
        boolean limit = true;
        int index = n - 1;
        while (limit) {
            int point = 0;
            for (int[] calc : abcd) {
                if (a[calc[1]] - a[calc[0]] == calc[2]) point += calc[3];
            }
            if (max < point) max = point;
            limit = countup(a, m);
        }

        System.out.println(max);
    }

    public static boolean countup(int[] a, int m) {
        boolean can_up = false;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == m) {
                if (i == 0) break;
                if (a[i - 1] == m) continue;
//                if (a[i - 1] < m) {
//                    for (int j = i; j < a.length; j++) {
//                        a[j] = a[j - 1] + 1;
//                    }
//                }
                a[i - 1]++;
                a[i] = a[i - 1];
                can_up = true;
                break;
            }
            a[i]++;
            can_up = true;
            break;
        }
        return can_up;
    }
}