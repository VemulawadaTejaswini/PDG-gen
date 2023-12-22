import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }

        for(int i=K;i<N;i++){
                if(A[i] > A[i-K]){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
        }






    }

}


