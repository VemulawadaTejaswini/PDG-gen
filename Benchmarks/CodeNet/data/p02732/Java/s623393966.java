import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int arr[]=new int[n];
        int f[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            f[arr[i]]++;
        }
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            long p=f[i];
            if(f[i]>1)
            sum=sum+((p)*(p+1)/2)-p;
        }
        for(int k=0;k<n;k++)
        {
            if(f[arr[k]]==1)
                System.out.println("0");
            else
            {
                int p=f[arr[k]];
//                System.out.println(sum);
                long v=sum-(((p)*(p+1)/2)-p);
//                System.out.println(v);
               v= v+((p-1)*p/2)-p;
//               System.out.println(v);
                if(v>=0)
                    System.out.println(v+1);
                else
                    System.out.println("0");
                
                
            
            }
            
        
        }
        
    }
}