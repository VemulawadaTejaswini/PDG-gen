import java.util.*;

public class Main {
    public static void main(String[] args) {
        // main
        Scanner sc = new Scanner(System.in);
        int N = nextInt(sc);
        int K = nextInt(sc);

        show(calc(N, K));
    }

    private static double calc(int N, int K) {

        List<Integer> denominators = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int continueNum = getContinueNum(K, i + 1);

            if (continueNum <= 1) break;
            
            denominators.add(calcPower(2, continueNum) * N);
        }

        double answer = 0;

        for (int den : denominators) {
            answer += 1d / den;
        }

        System.out.println(answer);

        if (denominators.size() != N) {
            answer += ( 1 / (2d*N) ) * (N - denominators.size());
        }

        return answer;
    }

    private static int calcPower(int radix, int index) {
        int num = 1;
        for (int i = 0; i < index; i++ ) {
            num = num * radix;
        }
        return num;
    }

    private static int getContinueNum(int K, int initial) {
        double num = K;
        int count = 0;
        do {
            count ++;
            num = num / 2;
        } while (num > initial);

        return count;
    }

    private static void show(double answer) {
        System.out.println(answer);
    }

    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
}
