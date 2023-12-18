import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int negativeNumCnt = 0;
        int min = -1;
        int prevAbs = -1;
        long absSum = 0;
        boolean zeroFlag = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                zeroFlag = true;
            }
            if (A[i] < 0) {
                negativeNumCnt++;
            }
            int currentAbs = Math.abs(A[i]);
            absSum += currentAbs;
            if (A[i] != 0 && currentAbs < prevAbs) {
                min = currentAbs;
            }
            prevAbs = currentAbs;
        }

        if (negativeNumCnt %2 == 0 || zeroFlag == true) {
            System.out.println(absSum);
        }
        else {
            long max = absSum - min * 2;
            System.out.println(max);
        }
    }
}