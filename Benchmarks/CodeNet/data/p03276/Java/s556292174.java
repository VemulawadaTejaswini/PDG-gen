import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.nextLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int K = Integer.parseInt(a[1]);
        a = scanner.nextLine().split(" ");

        int[] array = new int[N];
        int plusStart = -1;
        int minusStart = -1;

        for (int i = 0; i < N; ++i) {
            int it = Integer.parseInt(a[i]);
            if (plusStart < 0 && it >= 0) {
                plusStart = i;
                if (it == 0) {
                    minusStart = plusStart;
                } else if (i > 0) {
                    minusStart = plusStart - 1;
                }
            }
            array[i] = it;
        }
        if (plusStart < 0) {
            minusStart = N - 1;
        }

        if (minusStart == plusStart && K == 1) {
            System.out.println(0);
            return;
        }

        int min = Integer.MAX_VALUE;

        if (plusStart >= 0) {
            int start = 1;

            if (plusStart + K - 1 <= N - 1) {
                min = array[plusStart + K - 1];
            } else {
                //plusStart + K - 1 > N - 1
                //plusStart + K - N > 0
                start = plusStart + K - N;
            }
            for (int i = start; i < K; ++i) {
                if (plusStart - i < 0) {
                    break;
                }
                int w = array[plusStart - i] * -2 + array[plusStart - i + K - 1];
                if (w < min) {
                    min = w;
                }
            }
        }

        if (minusStart >= 0) {
            int start = 1;

            if (minusStart >= K - 1) {
                int w = array[minusStart - (K - 1)] * -1;
                if (w < min) {
                    min = w;
                }
            } else {
                // minusStart < K - 1
                // K - 1 - minusStart > 0
                start = K - 1 - minusStart;
            }

            for (int i = start; i < K; ++i) {
                if (minusStart + i >= N) {
                    break;
                }
                int w = array[minusStart + i] * 2 + array[minusStart - (K - 1 - i)] * -1;
                if (w < min) {
                    min = w;
                }
            }
        }
        System.out.println(min);
    }
}