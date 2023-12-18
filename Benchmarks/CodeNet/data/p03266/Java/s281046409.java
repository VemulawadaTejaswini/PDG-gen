import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;

        if(K > N){
            ans = 0;
        }
 /*       else if(K > N){
            ans = (K - 2) * (K - 1) / 2 + (2 * K - 2) * (2 * K - 1) / 2;; 
        }*/
        else if(K == 1){
            ans = (int) Math.pow(N, 3);
        }
        else if(K == 2){
            ans += (int) Math.pow((N/2), 3) + (int) Math.pow( ( ( N + 1 ) / 2 ), 3);
        }
        else if(K % 2 == 0){
            K /= 2;
            int KK = N/K;
            ans += (int) Math.pow((KK/2), 3) + (int) Math.pow( ( ( KK + 1 ) / 2 ), 3);
        }
        else if(K % 2 == 1){
            ans += (int) Math.pow( (N/K) , 3);
        }
        System.out.println(ans);
    }
}