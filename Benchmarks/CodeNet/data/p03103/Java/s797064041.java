import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        long res = rec(A,B,M, 0 );

        System.out.println(res);

    }

    static long rec(int[] A , int[] B, int m , int shop){
        if(m == 0) return 0;
        if(shop==A.length) return Long.MAX_VALUE/10 ;
        long minPay = Long.MAX_VALUE;
        for(int i=0 ; i<= B[shop];i++){//bottles
            if(m-i>=0){
                long pay =  (long)i * A[shop];
                pay += rec(A,B, m-i , shop+1);
                minPay  = pay<minPay? pay: minPay;
            }
        }
        return minPay;
    }


}
