///import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        int a[] = new int[n+m];
        for(int i = 0 ; i < n+m;i++)
            a[i] = sc.nextInt();
        Arrays.sort( a );
        int cnt = 0;
        for(int i = 0 ; i < n+m;i++){
           if(k < a[i])
               break;
           k -= a[i];
           cnt++;
        }
        System.out.println( cnt );

    }
}
