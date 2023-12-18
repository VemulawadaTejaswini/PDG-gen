

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] L = new int[m];
        int[] R = new int[m];
        for (int i = 0; i < m; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        System.out.println(Math.max(R[0] - L[m - 1] + 1, 0));

    }
}
