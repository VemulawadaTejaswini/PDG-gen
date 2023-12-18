import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numLines = scn.nextInt();
        int sideLength = scn.nextInt();

        int[][] Bins = new int[sideLength*2][sideLength*2];

        int max = 0;

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
                            int temp = ++Bins[(x + j) % (sideLength*2)][(y + k) % (sideLength*2)];
                            if (temp > max) {
                                max = temp;
                            }
                        }
                    } else {
                        if (!White) {
                            int temp = ++Bins[(x + j) % (sideLength*2)][(y + k) % (sideLength*2)];
                            if (temp > max) {
                                max = temp;
                            }
                        }
                    }
                }
            }
        }


        System.out.println(max);

    }
}

