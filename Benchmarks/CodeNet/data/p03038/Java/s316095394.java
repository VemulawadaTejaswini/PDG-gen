import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            long result = 0;
            long[] aList = new long[N];
            for (int i = 0; i < N; i++) {
                aList[i] = sc.nextLong();
                result += aList[i];
            }

            long[][] bcList = new long[M][2];
            for (int i = 0; i < M; i++) {
                bcList[i][0] = sc.nextInt();
                bcList[i][1] = sc.nextLong();
            }

            Arrays.sort(bcList, (a, b) -> Long.compare(a[1], b[1]));

            for (int i = bcList.length - 1; i >= 0; i--) {
                long[] bc = bcList[i];
                long b = bc[0];
                long c = bc[1];
                long existCnt = 0;

                for (int j = 0; j <= aList.length - 1; j++) {
                    if (aList[j] < c) {
                        existCnt++;
                        result += c - aList[j];
                        aList[j] = c;
                    }

                    if (existCnt == b) {
                        break;
                    }
                }
            }

            System.out.println(result);
        }
    }

}