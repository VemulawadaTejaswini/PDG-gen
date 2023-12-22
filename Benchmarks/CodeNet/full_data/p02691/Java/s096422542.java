import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long[] a = new long[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }

        long total = 0;
        for(int i=0; i<n-1; i++){
            for(long j=i+a[i]+1; j<n; j++){
                if(j-i == a[i]+a[(int)j]){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}