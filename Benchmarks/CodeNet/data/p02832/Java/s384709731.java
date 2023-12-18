import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int count=1,x=-1;
         for(int i=0;i<n;i++)
         {
             if(count==a[i])
             {
             count++;
             }
         }
         count=count-1;
         if(count==0)
         {
              System.out.println("-1");
         }
         else

      System.out.println(n-count);
    }
}