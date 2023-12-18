import java.util.Scanner;

public class Main {


    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dams = new int[N]; // A
        long allSum = 0;
        for (int i = 0; i < N; i++) {
            dams[i] = sc.nextInt();
            allSum += (long)dams[i];
        }

        long[] rains =  new long[N]; // x
        long sumWithoutX0 = 0;
        for (int i = 1; i < N; i+=2) {
            sumWithoutX0 += (long)dams[i] * 2;
        }
        rains[0] = allSum - sumWithoutX0;
        System.out.print(rains[0] + " ");

        for (int i = 1; i < N; i++) {
            rains[i] = 2 * dams[i - 1] - rains[i - 1];
            System.out.print(rains[i] + " ");
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

