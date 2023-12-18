import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] x = new int[N];

        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }

        long ans = 0;

        for(int i = 0; i < N-1; i++){
            ans += Math.min(A * (x[i+1] - x[i]), B);
        }
        System.out.println(ans);
    }
}