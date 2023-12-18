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
        System.out.println(solve(a, b, c));
    }

    private static int solve(int[] a, int[] b, int[] c) {
        int sum = 0;
        int bidx = 0;
        int cidx = 0;
        int[] bmemo = new int[a.length];
        boolean[] bvisited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = bidx; j < a.length; j++) {
                if (a[i] < b[j]) {
                    if (!bvisited[j]) {
                        for (int k = cidx; k < a.length; k++) {
                            if (b[j] >= c[k]) {
                                cidx++;
                            } else {
                                break;
                            }
                        }
                        bmemo[j] = a.length - cidx;
                        bvisited[j] = true;
                    }
                    sum += bmemo[j];
                } else {
                    bidx++;
                }
            }
        }
        return sum;
    }
}
