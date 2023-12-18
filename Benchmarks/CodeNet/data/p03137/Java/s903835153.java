import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 
        int M = sc.nextInt();

        if (N >= M) {
            System.out.println(0);
        } else {

            int[] xArr = new int[M];
            for (int i = 0; i < M; i++) {
                xArr[i] = sc.nextInt();
            } 
            Arrays.sort(xArr);
            int[] diff = new int[M - 1];
            for (int i = 0; i < M - 1; i++) {
                diff[i] = xArr[i + 1] - xArr[i];
            }
            Arrays.sort(diff);
            int minSum = 0;
            for (int i = 0; i < M - N; i++) {
                minSum += diff[i];
            }
            System.out.println(minSum);
        }
    }
}