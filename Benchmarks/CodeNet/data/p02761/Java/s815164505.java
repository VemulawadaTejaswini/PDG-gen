import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    Arrays.fill(arr,-1);
    int m=sc.nextInt();
    for(int i=0;i<m;i++)
    {
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        if(arr[t1]==-1)
        {
            arr[t1]=t2;
        }
        else
        {
            if(arr[t1]!=t2)
            {
                System.out.println("-1");
                return;
            }
        }
    }
    if(n==1)
    System.out.println(arr[1]);
    if(n>1&&arr[1]==0)
    {
        System.out.println("-1");
        return;
    }
    if(n==2)
    {
        if(arr[1]==0)
        {
            System.out.println("-1");
            return;
        }
        else if(arr[1]!=0&&arr[2]==0)
        {
            String str=arr[1]+"1";
            System.out.println(str);
        }
        else
        {
            
            String str=arr[1]+""+arr[2];
            System.out.println(str);
        }
    }
    if(n==3)
    {
        if(arr[2]==-1)
        {
            if(arr[3]<=0)
            System.out.println(arr[1]+"01");
            else if(arr[3]>0)
            System.out.println(arr[1]+"0"+arr[3]);
        }
        if(arr[2]!=-1)
        {
            if(arr[3]<=0)
            System.out.println(arr[1]+""+arr[2]+"1");
            else if(arr[3]>0)
            System.out.println(arr[1]+""+arr[2]+""+arr[3]);
        }
    }
  }
}
