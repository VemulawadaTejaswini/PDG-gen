import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        double k=(1/(4*m))*n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k)
            c++;
        }
        if(c>=m)
        System.out.println("Yes");
        else
        System.out.println("No");
    }}