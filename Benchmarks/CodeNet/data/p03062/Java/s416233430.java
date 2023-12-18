import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        double[] Ai = new double[N];
        int mainasu = 0;
        int count = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            Ai[i] = stdIn.nextInt();
        }

        double min = 0;
        for (int i = 0; i < N; i++) {
            if (Ai[i] < 0) {
                mainasu++;
                min = -Ai[i] < min ? min = -Ai[i] : min;
                count = i;
            } else {
                min = Ai[i] < min ? min = Ai[i] : min;
                count = i;
            }
        }

        if (mainasu % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (Ai[i] < 0) {
                    Ai[i] *= -1;
                    Ai[i + 1] *= -1;
                }
                sum += Ai[i];
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (i == count) {
                    if (Ai[i] > 0) {
                        Ai[i] *= -1;
                        Ai[i + 1] *= -1;
                    }
                } else {
                    if (Ai[i] < 0) {
                        Ai[i] *= -1;
                        Ai[i + 1] *= -1;
                    }
                }
                sum += Ai[i];
            }
        }
        System.out.println(sum);

    }
}