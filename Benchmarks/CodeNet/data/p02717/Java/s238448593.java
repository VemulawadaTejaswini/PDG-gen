import java.util.*;
class a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double m=sc.nextDouble();
        int arr[]=new int[n];
        double  b=0.0d;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           b=b+arr[i];
        }
        
      
        double k=((1/(4*m))*b;
      
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>(int)k)
            c++;
        }
      
        if(c>=m)
        System.out.println("Yes");
        else
        System.out.println("No");
    }}