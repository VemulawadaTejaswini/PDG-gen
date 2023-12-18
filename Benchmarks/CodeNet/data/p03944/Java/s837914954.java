import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] xya = new int[n][3];
        for (int i = 0; i < n; i++) {
            xya[i][0] = sc.nextInt();
            xya[i][1] = sc.nextInt();
            xya[i][2] = sc.nextInt();
        }

        int ans = solve(w, h, n, xya);
        System.out.println(ans);
    }

    static int solve(int w, int h, int n, int[][] xya) {

        int xMAX = w;
        int xMIN = 0;
        int yMAX = h;
        int yMIN = 0;
        for (int i = 0; i < n; i++) {
            int ptn = xya[i][2];

            // @formatter:off
            switch (ptn) {
                case 1: xMIN = Math.max(xya[i][0], xMIN); break;
                case 2: xMAX = Math.min(xya[i][0], xMAX); break;
                case 3: yMIN = Math.max(xya[i][1], yMIN); break;
                case 4: yMAX = Math.min(xya[i][1], yMAX); break;
            }
            // @formatter:on
        }
        int x = Math.max((xMAX - xMIN), 0);
        int y = Math.max((yMAX - yMIN), 0);

        return x * y;
    }
}
