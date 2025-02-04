import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        long[] B = new long[M];

        for(int i=0; i<N; i++){
            A[i] = sc.nextLong();
        }
        for(int i=0; i<M; i++){
            B[i] = sc.nextLong();
        }
        sc.close();

        //累計時間
        long  sum= 0;
        //答え
        int result = 0;
        //足し算をおこなう。
        int a = 0;
        int b = 0;
        while(sum <K){
            if(A[a]<B[b]){
                sum = sum+A[a];
                if(a<N-1){
                    a++;
                }
            }else {
                sum = sum + B[b];
                if(b<M-1){
                    b++;
                }
            }
            result++;
        }
        System.out.println(result-1);
    }
}
