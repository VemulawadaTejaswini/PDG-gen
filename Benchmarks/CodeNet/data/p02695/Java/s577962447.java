import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for(int i = 0;i < q;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        int[] A = new int[n];
        long maxScore = 0;

        for(int i = 0;i < Math.pow(10, n);i++) {

            for(int j = 0;j < n;j++) {
                A[j] = (i / (int)Math.pow(10, j)) % 10;
            }

            int tmp = A[0];
            if(tmp < 1) continue;
            boolean isCorrect = true;
            for(int j = 1;j < n;j++) {
                if(A[j] < tmp) {
                    isCorrect = false;
                    break;
                }
                tmp = A[j];
            }

            if(!isCorrect)continue;

            int score = 0;
            for(int j = 0;j < q;j++) {
                if(A[b[j] - 1] - A[a[j] - 1] == c[j]) score += d[j];
            }
            if(maxScore < score) {
                maxScore = score;
            }

        }

        System.out.println(maxScore);
    }

}
