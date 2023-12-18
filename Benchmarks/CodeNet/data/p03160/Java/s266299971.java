
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++)
        {
            h[i]=input.nextInt();
        }
        long sum1=0;
        int k=0;
        
        
        for( k=0;k<n-3;k++)
        {
            int first=h[k];
            int sec=h[k+1];
            int third=h[k+2];
            if(Math.abs(first-h[k+1])>Math.abs(first-h[k+2]))
            {
                sum1=sum1+Math.abs(first-third);
                k++;
            }
            else{
                sum1=sum1+Math.abs(first-sec);
            
            }
//            System.out.println(sum);
        }
        
        
        if(k==n-3)
        {
            sum1=sum1+Math.abs(h[k]-h[n-1]);
           
        }
        
        else if(k==n-2)
        {
             sum1=sum1+Math.abs(h[k]-h[n-1]);
        
        }
        
//        System.out.println(sum);
              
                
                
                long sum2=0;
                k=n;
                 for( k=n-1;k>2;k--)
        {
            int first=h[k];
            int sec=h[k-1];
            int third=h[k-2];
            
//            System.out.println(first+" "+sec+" "+third);
            if(Math.abs(first-h[k-1])>Math.abs(first-h[k-2]))
            {
                sum2=sum2+Math.abs(first-third);
                k--;
            }
            else{
                sum2=sum2+Math.abs(first-sec);
            
            }
//            System.out.println(sum2);
        }
        
        
        if(k==2)
        {
            sum2=sum2+Math.abs(h[k]-h[0]);
           
        }
        
        else if(k==1)
        {
             sum2=sum2+Math.abs(h[k]-h[0]);
        
        }
        
//        System.out.println(sum1+" "+sum2);
       if(sum1>sum2)
            System.out.println(sum2);
       else
            System.out.println(sum1);
    }
}
