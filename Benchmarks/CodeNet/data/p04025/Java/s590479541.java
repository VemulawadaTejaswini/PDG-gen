import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        long ans = Long.MAX_VALUE;

        for(int i = -100; i <= 100; i++){
            long sum = 0;
            for(int j = 0; j < N; j++){
                sum += (long)Math.pow(i-a[j], 2);
            }
            ans = Math.min(ans, sum);
        }

        System.out.println(ans);
    }
}