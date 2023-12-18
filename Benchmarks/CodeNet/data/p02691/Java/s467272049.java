import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long[] a = new long[n];
        long[] min = new long[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        min[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            min[i] = (long)Math.min(a[i],min[i+1]);
        }

        long total = 0;
        for(int i=0; i<n-1; i++){
            for(long j=i+a[i]+min[i+1]; j<n; j++){
                if(j-i == a[i]+a[(int)j]){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}