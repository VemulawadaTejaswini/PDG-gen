import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            b[i] = s.nextInt();
        }

        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>b[i])
            {
                ans+=(a[i]-b[i]);
            }
        }

        System.out.println(ans);
        

    
    }
    

}