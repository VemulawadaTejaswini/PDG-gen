import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       
       int sum=0;
      Arrays.sort(a);
      for(int j=0;j<k;j++)
      {
        sum=sum+a[j];
      }
      
      System.out.println(sum);
       
       
       
       
    }
}
