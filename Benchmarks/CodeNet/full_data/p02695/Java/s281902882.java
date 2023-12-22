import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        int K[][];
        K = new int[Q][4];
        for(int i = 0;i < Q;i++){
            K[i][0] = scan.nextInt();
            K[i][1] = scan.nextInt();
            K[i][2] = scan.nextInt();
            K[i][3] = scan.nextInt();
        }
        int A[];
        A = new int[N];
        for(int t = 0;t < N;t++){
            A[t] = t;
        }
        int max = 0;
        int cal = 0;
        for(int x = 1;x <= M;x++){
            cal = maxi(A,K,Q);
            if(max < cal) max = cal;
            for(int n = N-1;n >= 0;n--){
                if(n == 0){
                    A[n]++;
                }else if(A[n] == A[n-1]){
                    A[n]++;
                }
            }
        }
        System.out.println(max);
    }
    public static int maxi(int A[],int K[][],int Q){
        int sum = 0;
        for(int i = 0;i < Q;i++){
            sum = plus(A,K[i][0],K[i][1],K[i][2],K[i][3]);
        }
        return sum;
    }
    public static int plus(int A[],int a,int b,int c,int d){
        int result;
        if((A[b]-A[a])==c) result = d;
        else result = 0;
        return result;
    }
}
