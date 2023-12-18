import java.util.Scanner;

//https://atcoder.jp/contests/agc035/tasks/agc035_d
public class AddAndRemove {
    private static long[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solve(0, n, 1, 1));
    }

    /*
    reduce the interval of a into 2 cards. What is the minimum value of the left card
    multiplied by leftCoef, plus the right c card multiplied by rightCoef
     */
    private static long solve(int l, int r, int leftCoef, int rightCoef) {
        assert l + 1 < r;
        if (l + 2 == r) {
            return a[l] * leftCoef + a[r - 1] * rightCoef;
        }
        long ans = Long.MAX_VALUE;
        for (int mid = l + 1; mid < r - 1; mid++) {
            long bestSolutionThisMid;
            if (mid - l == 1 && r - mid == 2) {
                bestSolutionThisMid = leftCoef * (a[l] + a[mid]) + rightCoef * (a[mid] + a[r - 1]);
            } else if (mid - l == 1 && r - mid != 2) {
                bestSolutionThisMid = leftCoef * a[l] + leftCoef * 2 * a[mid] + rightCoef * a[mid] +
                        +solve(mid + 1, r, leftCoef + rightCoef, rightCoef);
            } else if (mid - l != 1 && r - mid == 2) {
                bestSolutionThisMid = solve(l, mid, leftCoef, leftCoef + rightCoef) +
                        leftCoef * a[mid] + rightCoef * 2 * a[mid] + rightCoef * a[r - 1];
            } else {
                bestSolutionThisMid = solve(l, mid, leftCoef, 2 * leftCoef + rightCoef) +
                        3 * leftCoef * a[mid] + 2 * rightCoef * a[mid] +
                        solve(mid + 1, r, leftCoef + rightCoef, rightCoef);

                bestSolutionThisMid = Math.min(bestSolutionThisMid,
                        solve(l, mid, leftCoef, leftCoef + rightCoef)
                                + 2 * leftCoef * a[mid] + 3 * rightCoef * a[mid]
                                + solve(mid + 1, r, leftCoef + 2 * rightCoef, rightCoef));
            }
            ans = Math.min(bestSolutionThisMid, ans);
        }
        return ans;
    }
}
