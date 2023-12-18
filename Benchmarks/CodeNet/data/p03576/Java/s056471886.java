import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created on 2017/10/20 7:35.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];

            Set<Integer> setX = new HashSet<>();
            Set<Integer> setY = new HashSet<>();

            for (int i = 0; i < N; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                setX.add(x[i]);
                setY.add(y[i]);
            }

            List<Integer> listX = new ArrayList<>(setX);
            List<Integer> listY = new ArrayList<>(setY);
            int sizeX = listX.size();
            int sizeY = listY.size();

            long ans = Long.MAX_VALUE;

            for (int yi = 0; yi < sizeY; yi++) {
                int yFrom = listY.get(yi);
                for (int yj = yi; yj < sizeY; yj++) {
                    int yTo = listY.get(yj);
                    int xi = 0;
                    int xj = 0;

                    while (xj < sizeX) {
                        int xFrom = listX.get(xi);
                        int xTo = listX.get(xj);
                        int cnt = 0;
                        for (int i = 0; i < N; i++) {
                            if (xFrom <= x[i] && x[i] <= xTo && yFrom <= y[i] && y[i] <= yTo) {
                                cnt++;
                            }
                        }
                        if (cnt >= K) {
                            ans = Math.min(ans, (long) (xTo - xFrom) * (yTo - yFrom));
                            xi++;
                            xj = Math.max(xj, xi);
                        } else {
                            xj++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}