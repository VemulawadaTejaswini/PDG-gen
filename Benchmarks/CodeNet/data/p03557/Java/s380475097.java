import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println(solve2(a, b, c));
    }

    private static int solve2(int[] a, int[] b, int[] c) {
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            int aidx = Arrays.binarySearch(a, b[j]);
            if (aidx > 0) {
                while (aidx > 0 && a[aidx - 1] == b[j]) {
                    aidx--;
                }
            } else if (aidx < 0) {
                aidx = aidx * -1 - 1;
            }
            if (aidx == 0) {
                continue;
            }
            int cidx = Arrays.binarySearch(c, b[j]);
            if (cidx > 0) {
                while (c[cidx + 1] == b[j] && cidx < a.length - 1) {
                    cidx++;
                }
                cidx = a.length - cidx - 1;
            } else if (cidx < 0) {
                cidx = a.length + cidx + 1;
            }
            if (cidx == 0) {
                continue;
            }
            sum += aidx * cidx;
        }
        return sum;
    }
}
