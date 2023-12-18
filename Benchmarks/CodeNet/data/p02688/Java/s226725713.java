import java.util.*;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int i;
        int j,ans=0;
        int d[]= new int[k];
        int count[]= new int[n+1];
        int a[]= new int[n*n];
        int x=0;
        for(i=0;i<k;i++)
        {
          d[i] = s.nextInt();
          if(d[i]>0)
          for(j=0;j<d[i];j++)
          {
          a[x+j]= s.nextInt();
          x++;
            
          }
          
        }
        for(i=0;i<x;i++)
        {
            count[a[i]]=1;
        }
         for(i=1;i<n+1;i++)
        {
            if(count[i]==0)
            ans++;
        }
        System.out.println(ans);
        
        
        
    }
}