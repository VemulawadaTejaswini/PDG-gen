import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] c = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        String ans = solve(c);

        System.out.println(ans);
    }

    private static String solve(int[][] c) {
        for (int d=0; d<2; d++) {
            if (!equals(c[0][d+1] - c[0][d], c[1][d+1] - c[1][d], c[2][d+1] - c[2][d])) {
                return "No";
            }
        }

        for (int d=0; d<2; d++) {
            if (!equals(c[d+1][0] - c[d][0], c[d+1][1] - c[d][1], c[d+1][2] - c[d][2])) {
                return "No";
            }
        }

        return "Yes";
    }

    private static boolean equals(int d1, int d2, int d3) {
        if (d1 == d2 && d2 == d3) return true;

        return false;
    }
}