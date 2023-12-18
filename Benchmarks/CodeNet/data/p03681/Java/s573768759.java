import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(Math.abs(N-M) > 1){
            System.out.println(0);
            return;
        }
        long r = 1000000007;
        long ans = 1;
        while(N > 0 && M > 0){
            ans *= N;
            ans %= r;
            ans *= M;
            ans %= r;
            N--;
            M--;
        }
        if(N == M)  ans *= 2;
        ans %= r;
        System.out.println(ans);
    }
}