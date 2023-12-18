import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int W = cin.nextInt();
        int H = cin.nextInt();
        int N = cin.nextInt();

        int[][] xya = new int[N][3];
        for (int i = 0; i < N; i++) {
            xya[i][0] = cin.nextInt();
            xya[i][1] = cin.nextInt();
            xya[i][2] = cin.nextInt();
        }

        int maxX = W;
        int minX = 0;
        int maxY = H;
        int minY = 0;

        for (int i = 0; i < N; i++) {
            int a = xya[i][2];

            switch (a) {
                case 1: minX = Math.max(xya[i][0], minX); break;
                case 2: maxX = Math.min(xya[i][0], maxX); break;
                case 3: minY = Math.max(xya[i][1], minY); break;
                case 4: maxY = Math.min(xya[i][1], maxY); break;
            }
        }

        int x = Math.max(maxX - minX, 0);
        int y = Math.max(maxY - minY, 0);

        System.out.println(x * y);
    }
}