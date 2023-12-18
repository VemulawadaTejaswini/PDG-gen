//package Contest066;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            if(n%2==0)
            {
                for(int i=n-1;i>0;i-=2)
                    out.print(arr[i]+" ");
                for(int i=0;i<=n-1;i+=2)
                    out.print(arr[i]+" ");
                out.println();
            }
            else{
                for(int i=n-1;i>=0;i-=2)
                    out.print(arr[i]+" ");
                for(int i=1;i<=n-1;i+=2)
                    out.print(arr[i]+" ");
                out.println();
            }
        out.flush();
    }
}
