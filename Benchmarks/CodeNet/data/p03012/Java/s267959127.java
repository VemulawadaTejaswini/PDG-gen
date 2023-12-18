import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] W = new int[N];
        for (int i = 0; i < N; i++)
            W[i] = sc.nextInt();
        
        int sum = 0;

        for(int i = 0; i < N; i++)
            sum += W[i];
        
        int ans = sum;
        
        for(int i = 0; i < N; i++){
            int sum_i = sum_t(W, i);
            if(Math.abs((sum_i)-(sum-sum_i)) < ans)
                ans = Math.abs((sum_i)-(sum-sum_i));
        }
        System.out.println(ans);
        sc.close();
    }
    
    static int sum_t(int[] a, int t){
        int sum = 0;
        for(int i = 0; i < t; i++)
            sum += a[i];
        return sum;
    }
}