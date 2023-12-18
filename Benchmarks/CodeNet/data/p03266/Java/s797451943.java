import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;

        if(K % 2 == 0){
            K /= 2;
            int KK = N/K;
            ans += (int) Math.pow((KK/2), 3) + (int) Math.pow( ( ( KK + 1 ) / 2 ), 3);
        }

        /*if(K % 2 == 0){
            K /= 2;
        }*/

        if(K % 2 == 1){
            ans += (int) Math.pow( (N/K) , 3);
        }
        System.out.println(ans);
    }
}