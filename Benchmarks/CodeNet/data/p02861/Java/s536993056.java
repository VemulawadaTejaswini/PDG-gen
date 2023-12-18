import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            x.add(s.nextInt());
            y.add(s.nextInt());
        }

        double sumed = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int side = Math.abs(x.get(i) - x.get(j));
                int vertical = Math.abs(y.get(i) - y.get(j));
                sumed += Math.sqrt(Math.pow((double) side, 2) + Math.pow((double) vertical, 2));
            }
        }
        int mpy = N*(N-1);
        double mpy2 = (N - 1) * 2;
        System.out.print((sumed * mpy2) / mpy);
    }
}
