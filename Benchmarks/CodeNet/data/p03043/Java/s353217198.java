import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        double ans= 0.0;
        ans+=Math.max(0.0,(double)(n-k)/n);

        for (int i=1; i<=Math.min(n,k); i++)
        {
            int tmp=i;
            int count=0;
            while(tmp<k)
            {
                tmp*=2;
                count++;
            }
            ans+=(Math.pow(0.5,(double)count)*(double)1/n);

        }
        System.out.println(String.format("%.10f", ans));


    }
}