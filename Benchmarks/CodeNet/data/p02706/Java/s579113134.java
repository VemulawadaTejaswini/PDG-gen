import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
      
      int n=s.nextInt();
      int m=s.nextInt();
      int []a=new int[m];
      int sum=0;
      for(int i=0;i<m;i++)
      {
      a[i]=s.nextInt();
        sum+=a[i];
      }
      if(sum==n)
        System.out.println(0);
     else if(sum>n)
      {
       System.out.println(sum-n);
      }
      else
        System.out.println(-1);
      
    }
}