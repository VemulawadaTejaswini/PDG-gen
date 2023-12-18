import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] ci = new int[n];
        int[][] aij = new int[n][m];

        for (int i=0; i<n; i++) {
            ci[i] = sc.nextInt();
            for (int j=0; j<m; j++) {
                aij[i][j] = sc.nextInt();
            }
        }

        if (canSuccess(x, aij)) {
            System.out.println(minCost(x, ci, aij));
        } else {
            System.out.println("-1");
        }
    }
    private static int minCost(int x, int[] ci, int[][] aij) {
        boolean[] t = new boolean[ci.length];
        for (int i=0; i<t.length; i++) {
            t[i] = true;
        }
        int minCost = cost(t, ci);

        return minCostR(minCost, x, t, ci, aij);
    }
    private static int minCostR(int nowMin, int x, boolean[] t, int[] ci, int[][] aij) {
        List<boolean[]> recTlist = new ArrayList<>();
        int start = 0;
        for (int i=t.length-1; i>=0; i--) {
            if (!t[i]) {
                start = i;
                break;
            }
        }
        for (int i=start; i<t.length; i++) {
            if (t[i]) {
                boolean[] newT = copyT(t);
                newT[i] = false;
                if (canSuccess(x, newT, aij)) {
                    int cost = cost(newT, ci);
                    if (nowMin > cost) {
                        nowMin = cost;
                    }
                    recTlist.add(newT);
                }
            }
        }
        for (boolean[] recT : recTlist) {
            nowMin = minCostR(nowMin, x, recT, ci, aij);
        }
        return nowMin;
    }
    private static boolean[] copyT(boolean[] t) {
        boolean[] ret = new boolean[t.length];
        for (int i=0; i<ret.length; i++) {
            ret[i] = t[i];
        }
        return ret;
    }
    private static int cost(boolean[] t, int[] ci) {
        int sum = 0;
        for (int i=0; i<t.length; i++) {
            if (t[i]) {
                sum += ci[i];
            }
        }
        return sum;
    }
    private static boolean canSuccess(int x, boolean[] t, int[][] aij) {
        int[] sum = new int[aij[0].length];
        for (int i=0; i<aij.length; i++) {
            if (t[i]) {
                for (int j = 0; j < aij[i].length; j++) {
                    sum[j] += aij[i][j];
                }
            }
        }
        return Arrays.stream(sum).allMatch(s -> s >= x);
    }
    private static boolean canSuccess(int x, int[][] aij) {
        boolean[] t = new boolean[aij.length];
        for (int i=0; i<t.length; i++) {
            t[i] = true;
        }
        return canSuccess(x, t, aij);
    }
}