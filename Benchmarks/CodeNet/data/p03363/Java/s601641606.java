import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] sum = new int[N];

        A[0] = sc.nextInt();
        sum[0] = A[0];

        for (int i = 1; i < N; i++) {
            A[i] = sc.nextInt();
            sum[i] = sum[i - 1] + A[i];
        }
        long count = 0L;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+ 1; j < N ; j++) {
                if (i == 0) {
                    if (sum[j]==0) {
                        count = count + 1L;
                    }
                }else{
                    if (sum[j] - sum[i - 1] ==0) {
                        count = count + 1L;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
