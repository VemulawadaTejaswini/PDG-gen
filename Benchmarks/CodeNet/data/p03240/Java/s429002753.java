import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int nextInt () {return Integer.parseInt(sc.next());}

    public static void main(String[] args) {
        int N = nextInt();

        int[][] values = new int[N][3];
        for (int i = 0; i < N; i++) {
            values[i] = new int[] {nextInt(), nextInt(), nextInt()};
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int[] centerPosi = new int[]{i, j};

                int H = values[0][2] + Math.abs(centerPosi[0] - values[0][0]) + Math.abs(centerPosi[1] - values[0][1]);
                boolean isOK = true;
                for (int k = 0; k < N; k++) {
                    int x = values[k][0];
                    int y = values[k][1];
                    int h = values[k][2];

                    int estimatedH = Math.max((H - Math.abs(x - centerPosi[0]) - Math.abs(y - centerPosi[1])), 0);
                    isOK = isOK && (estimatedH == h);
                }
                if (isOK) {
                    System.out.println(i + " " + j + " " + H);
                }
            }
        }
    }


}
