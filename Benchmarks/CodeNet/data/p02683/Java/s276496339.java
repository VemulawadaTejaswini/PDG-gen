import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();
        Integer M = sc.nextInt();
        Integer X = sc.nextInt();

        Integer[] C = new Integer[N];
        Integer[][] A = new Integer[N][M];

        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
            for (int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        boolean isCleared = false;
        int minCost = Integer.MAX_VALUE;
        int iterationNum = (int) Math.pow(2, N);
        for (int i = 0; i < iterationNum; i++){
            String binaryString = String.format("%" + String.valueOf(N) + "s", Integer.toBinaryString(i));
			binaryString = binaryString.replace(" ", "0");

            int sumCost = 0;
            Integer[] levels = new Integer[M];
            for (int m = 0; m < M; m++) {
                levels[m] = 0;
            }

            for (int n = 0; n < N; n++) {
                if (binaryString.substring(n, n+1).equals("1")) { 
                    sumCost += C[n];
                    for (int m = 0; m < M; m++) {
                        levels[m] += A[n][m];
                    }
                }
            }

            boolean isSatisfied = true;
            for (int m = 0; m < M; m++) {
                if (levels[m] < X) {
                    isSatisfied = false;
                    break;
                }
            }

            if (isSatisfied) {
                isCleared = true;
                if (sumCost < minCost) {
                    minCost = sumCost;
                }
            }
        }
    
        if (isCleared) {
            System.out.println(minCost);
        } else {
            System.out.println(-1);
        }
    }
}