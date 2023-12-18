import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] sortedX = new long[N];

        for (int i = 0; i < N; i++) {
            long v = sc.nextLong();
            x[i] = v;
            sortedX[i] = v;
        }
        Arrays.parallelSort(sortedX);

        long highMid = sortedX[N/2];
        long lowMid = sortedX[(N/2) - 1];

        for (int i = 0; i < N; i++) {
            if (x[i] <= lowMid) {
                System.out.println(highMid);
            } else {
                System.out.println(lowMid);
            }
        }
    }
}