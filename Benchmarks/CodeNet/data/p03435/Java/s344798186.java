import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();


        int[] b1 = dif(a[0]);
        int[] b2 = dif(a[1]);
        int[] b3 = dif(a[2]);

        if (b1[0] == b2[0] && b1[1] == b2[1]
                && b2[0] == b3[0] && b2[1] == b3[1])
            System.out.println("Yes");
        else System.out.println("No");
    }

    private int[] dif(int a[]) {
        return new int[]{a[1] - a[0], a[2] - a[1]};
    }

    public static void main (String[] args) {
        new Main();
    }

}
