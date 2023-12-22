import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;
        int ans[] = new int[N];
        for(int a=0;a<N;a++)
        {
            ans[a] = 0;
        }
        for(int i=0;i<K;i++)
        {
            int d = sc.nextInt();
            for(int j=0;j<d;j++)
            {
                int A = sc.nextInt();
                if(ans[A-1]==0)
                {
                    ans[A-1] = A;
                }
            }
        }
        for(int b=0;b<N;b++)
        {
            if(ans[b]==0)
            {
                sum++;
            }
        }
    }
}