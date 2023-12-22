import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long ans = 0;
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
            if(i != 0 && A[i-1] > A[i]){
                ans += A[i-1] - A[i];
                A[i] = A[i-1];
            }

        }

        System.out.println(ans);


    }

}


