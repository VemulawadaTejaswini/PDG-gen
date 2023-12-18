import java.io.*;
import java.util.*;
 
public class Main
{
    
    public static int check(int A,int B,int N)
    { 
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int [] arr= new int[N];
      for(int i=0;i<N;i++)
      {
        arr[i]=sc.nextInt(); 
      }
      for(int i=0;i<N;i++)
      {
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int res=arr[x-1];
        for(int j=x-1;j<y;j++)
        {
          res=Math.min(res,arr[j]);
        }
        System.out.println(res);
      }
    }
}