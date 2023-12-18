import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int ans = ( (N-1) + (K-1) + 1 ) / K;

        System.out.println(ans);
    }
}