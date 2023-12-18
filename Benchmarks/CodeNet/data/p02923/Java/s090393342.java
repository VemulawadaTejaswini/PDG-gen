import java.util.*;
public class A
{ 
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[50];int i;int j;int k;int max;
        int p[]=new int[50];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         for(i=0;i<n-1;i++)
{
    j=i;k=0;
 while(arr[j]>=arr[j+1]&&j<n-1)
 { 
     j++;k++;
     
 }
    p[i]=k;
}
max=p[0];
for(i=0;i<n-1;i++)
{ 
    if(p[i]>max)
    max=p[i];
}
   System.out.println(max);
}
}     