import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numLines = scn.nextInt();
        int sideLength = scn.nextInt();

        int[][] Bins = new int[sideLength*2][sideLength*2];

        for (int i = 0; i < numLines; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            char c = scn.next().charAt(0);

            for (int j = 0; j < sideLength*2; j++) {
                for (int k = 0; k < sideLength*2; k++) {
                    boolean White = false;
                    if (j >= sideLength) {
                        White = !White;
                    }
                    if (k >= sideLength) {
                        White = !White;
                    }
                    if (c == 'W') {
                        if (White) {
                            Bins[(x + j) % (sideLength*2)][(y + k) % (sideLength*2)]++;
                        }
                    } else {
                        if (!White) {
                            Bins[(x + j) % (sideLength*2)][(y + k) % (sideLength*2)]++;
                        }
                    }
                }
            }
        }

        int max = 0;
        for (int x = 0; x < sideLength*2; x++) {
            for (int y = 0; y < sideLength *2; y++) {
                if (Bins[x][y] > max) {
                    max = Bins[x][y];
                }
            }
        }

        System.out.println(max);
}
}