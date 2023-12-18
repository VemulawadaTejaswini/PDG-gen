import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int[] SInts = splitAsIntArray(S, N);
        int cnt = 0;

        for (int i = 0; i < 1000; i++) {

            int[] PIN = {i / 100, (i / 10) % 10, i % 10};
            int digitCnt = 0;

            for (int j = 0; j < N; j++) {
                if (SInts[j] == PIN[digitCnt]) {
                    digitCnt++;
                }
                if (digitCnt == 3) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    static int[] splitAsIntArray(String S, int N) {
        int[] SInts = new int[N];
        for (int i = 0; i < N; i++) {
            SInts[i] = Character.getNumericValue(S.charAt(i));
        }
        return SInts;
    }
}