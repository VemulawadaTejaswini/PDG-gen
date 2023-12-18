import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] array = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[][] arraySum = new int[2][N+1];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < N + 1; j++) {
                arraySum[i][j] = arraySum[i][j-1] + array[i][N-j];
            }
        }
        
        int count = array[0][0];
        boolean flag = false;

        if (N == 1) {
            count += array[1][0];
        } else {
            for (int i = 1; i < N; i++) {
                if (flag == false) {
                    if (arraySum[0][N - i] > arraySum[1][N - i - 1]) {
                        count += array[0][i];

                        if (i == N - 2) {
                            count += array[1][i];
                            flag = true;
                        }

                    } else {
                        count += array[0][i];
                        count += array[1][i];
                        flag = true;
                    }
                } else {
                    count += array[1][i];
                }
            }
        }

        System.out.println(count);
    }
}