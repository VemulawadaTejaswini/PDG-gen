import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        int i = 0;
        long sum = 0;
        //ここで部分和を保持する
        //後で和を作りたいときはその差を用いて算出する
        long[] part_sum = new long[N];
        while(i < N){
            a[i] = sc.nextInt();
            sum += a[i];
            part_sum[i] = sum;
            i++;
        }
        int count = 0;
        long[] memo = new long[N];
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N - j; k++) {
                if(j == 0){
                    memo[k] = a[k];
                    count++;
                }else{
                    memo[k] = memo[k] ^ a[k + j];
                    long tmp_sum;
                    if(k == 0){
                        tmp_sum = part_sum[k + j];
                    }else{
                        tmp_sum = part_sum[k + j] - part_sum[k - 1];
                    }
                    if(tmp_sum == memo[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}