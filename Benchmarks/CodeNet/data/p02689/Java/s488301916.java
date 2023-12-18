import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int H[] = new int[N];
        int sum[] = new int[N];
        int sum2[] = new int[N];
        int sumsum = 0;
        for(int i=0;i<N;i++)
        {
            H[i] = sc.nextInt();
            sum[i] = 0;
            sum2[i] = 0;
        }
        int A[] = new int[M];
        int B[] = new int[M];
        for(int i=0;i<M;i++)
        {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            sum[A[i]-1]++;
            sum[B[i]-1]++;
        }
        for(int i=0;i<M;i++)
        {
            if(H[A[i]-1]>H[B[i]-1])
            {
                sum2[A[i]-1]++;
            }
            else if(H[A[i]-1]<H[B[i]-1])
            {
                sum2[B[i]-1]++;
            }
        }
        for(int i=0;i<N;i++)
        {
            if(sum2[i]==sum[i])
            {
                sumsum++;
            }
        }
        System.out.println(sumsum);
    }
}