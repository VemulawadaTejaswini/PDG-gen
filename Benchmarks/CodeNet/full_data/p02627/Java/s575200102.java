import java.util.*;
class Main
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int arr[]=new int[100001];
     long sum=0;
    
     for(int i=0;i<x;i++)
    {
      int temp=sc.nextInt();
        arr[temp]++;
        sum+=temp;
    }
     int op=sc.nextInt();
     
     for(int i=0;i<op;i++)
     {
       int a=sc.nextInt();
       int b=sc.nextInt();
      
       if(arr[a]!=0)
       {
          arr[b]+=arr[a];
         
       sum+=(b-a)*arr[a];
        arr[a]=0;
       }
       System.out.println(sum);
     }
     sc.close();
       
   }
}