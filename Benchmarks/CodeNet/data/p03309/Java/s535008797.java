import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];

        for(int i = 0; i < N; i++){
             A[i] = sc.nextInt() - i - 1;
        }
        Arrays.sort(A);

        long ans = 1000000000;
        int tmp;
        for(long i = A[0]; i < A[N-1]; i++){
            tmp = 0;
            for(int j = 0; j < N; j++){
                tmp += Math.abs(A[j] - i);
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }

    
}