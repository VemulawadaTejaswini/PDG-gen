import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Collections;

class Main {

    static int N;
    static int M;
    static int Q;

    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;

    static int ans = 0;


    private static void printA(ArrayList<Integer> A) {
        for  (Integer i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void dfs(ArrayList<Integer> A) {
        if (A.size() == N + 1) {
            int now = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i]) - A.get(a[i]) == c[i]) now += d[i];
            }
            ans = Math.max(ans, now);
            return;
        }

        if (A.size() > N + 1) return;

        A.add(A.get(A.size() - 1));
        while (A.get(A.size() - 1) <= M) {
            dfs(new ArrayList<Integer>(A)); // depth first search.
            Integer v = A.get(A.size() - 1);
            A.set(A.size() - 1, v + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt(); // less than 10
        Q = sc.nextInt(); // less than 50

        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        dfs(A);

        System.out.println(ans);
    }

}