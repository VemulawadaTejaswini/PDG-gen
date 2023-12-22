

import java.util.Scanner;

public class Main {
    public static int[] A = new int[50];
    public static int n;

    public static boolean solve(int i, int m) {
        if(m == 0) return true;
        if(i >= n) return false;
        boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);
        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] m = new int[q];
        for(int j = 0; j < q; j++) {
            m[j] = sc.nextInt();
        }
        for(int t : m) {
            if(solve(0, t)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}

