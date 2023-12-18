import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int priceSum = 0;
        int[] openCount = new int[N];
        int[][] keyPrice = new int[M][2];
        int[][] keyOpen = new int[M][N];
        for (int i = 0; i < M; i++) {

            // key idx vs price
            keyPrice[i][0] = i;
            keyPrice[i][1] = sc.nextInt();
            priceSum += keyPrice[i][1];

            // key idx vs box can be opened
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                int c = sc.nextInt();
                keyOpen[i][c-1] = 1;
                openCount[c-1]++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (openCount[i] == 0) {
                System.out.println(-1);
                return;
            }
        }

        Arrays.sort(keyPrice, (a,b) -> b[1] - a[1]);
        for (int i = 0; i < M; i++) {
            int keyIdx = keyPrice[i][0];
            boolean canDelete = true;
            for (int j = 0; j < N; j++) {
                if (openCount[j] - keyOpen[keyIdx][j] == 0) {
                    canDelete = false;
                    break;
                }
            }
            if (canDelete) {
                priceSum -= keyPrice[i][1];
                for (int j = 0; j < N; j++) {
                    openCount[j] -= keyOpen[keyIdx][j];
                }
            }
        }
        
        System.out.println(priceSum);
    }
}
