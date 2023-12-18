import java.util.function.BiFunction;
import java.util.function.Function;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int D = Integer.parseInt(sc.next());
        int[][] x = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                x[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        BiFunction<Integer, Integer, Double> distance = (i, j) -> {
            double y = 0.0;
            for (int k = 0; k < D; k++) {
                y += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
            }
            return Math.sqrt(y);
        };
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (distance.apply(i, j) % 1 == 0)  ans++;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}