import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        for(int b = K+1;b <= N;b++){
            ans += (N/b)*(b-K)+Math.max(0, N%b-K+1);
        }
        if(K == 0)  ans -= N;
        System.out.println(ans);
    }
}