import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] paths = new int[N - 1][2];
        for (int i = 0; i < paths.length; i++) {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            paths[i][0] = Math.min(a, b);
            paths[i][1] = Math.max(a, b);
        }

        sc.nextLine();
        final int M = sc.nextInt();
        BitSet[] constraints = new BitSet[M];
        for (int i = 0; i < M; i++) {
            sc.nextLine();
            int u = sc.nextInt();
            int v = sc.nextInt();
            BitSet constraint = new BitSet(paths.length);
            travel(constraint, paths, u, v);
            constraints[i] = constraint;
        }
        //        for (int i = 0; i < paths.length; i++) {
        //            System.out.println(i + ": " + paths[i][0] + " -> " + paths[i][1]);
        //        }
        //        for (BitSet constraint : constraints) {
        //            System.out.println(constraint);
        //        }

        long finalResult = 0;
        for (int i = 0; i < (int) Math.pow(2, M); i++) {
            BitSet result = new BitSet(paths.length);
            int orCount = 0;
            for (int j = 0; j < M; j++) {
                if (((1 << j) & i) == (1 << j)) {
                    result.or(constraints[j]);
                    orCount++;
                }
            }
            long tmpResult = (long) Math.pow(2, N - 1 - result.cardinality());
            //System.out.println(result + ":" + tmpResult);
            if (orCount % 2 == 0) {
                finalResult += tmpResult;
            } else {
                finalResult -= tmpResult;
            }
        }
        System.out.println(finalResult);
    }

    static boolean travel(BitSet constraint, int[][] paths, int from, int to) {
        int tmp = Math.min(from, to);
        to = Math.max(from, to);
        from = tmp;
        for (int i = 0; i < paths.length; i++) {
            if (constraint.get(i)) {
                continue;
            }
            int[] path = paths[i];
            if (path[0] == from && path[1] == to) {
                constraint.set(i);
                return true;
            } else if (path[0] == from) {
                constraint.set(i);
                if (travel(constraint, paths, path[1], to)) {
                    return true;
                }
                constraint.set(i, false);
            } else if (path[1] == from) {
                constraint.set(i);
                if (travel(constraint, paths, to, path[0])) {
                    return true;
                }
                constraint.set(i, false);
            }
        }
        return false;
    }
}