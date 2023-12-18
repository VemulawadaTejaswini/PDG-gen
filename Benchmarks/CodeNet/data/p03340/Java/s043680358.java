import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int i = 0;
        int sum = 0;
        //ここで部分和を保持する
        //後で和を作りたいときはその差を用いて算出する
        int[] part_sum = new int[N];
        while(i < N){
            a[i] = sc.nextInt();
            sum += a[i];
            part_sum[i] = sum;
            i++;
        }
        int count = 1;
        int[][] memo = new int[N][N];
        memo[0][0] = a[0];
        for (int j = 1; j < N; j++) {
            for (int k = 0; k <= j; k++) {
                if(k == 0){
                    memo[j][k] = a[j];
                    count++;
                }else{
                    memo[j][k] = memo[j - 1][k - 1] ^ a[j];
                    int tmp_sum = 0;
                    if(j >= k + 1){
                        tmp_sum = part_sum[j] - part_sum[j - k -1];
                    }else{
                        tmp_sum = part_sum[j];
                    }
                    if(tmp_sum == memo[j][k]){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
