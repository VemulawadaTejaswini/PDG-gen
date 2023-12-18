import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        long max = 0;
        for(long i = 0; i <= K; i++){
            long sum = 0;
            for(int j = 0; j < N; j++){
                long xor = i ^ A[j];
                sum += xor;
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}