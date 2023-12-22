import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] a=new int[n];
int c=0;
		for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        	                Arrays.sort(a);
		for(int i=0;i<n;i++)
        {
          	for(int j=i+1;j<n;j++)
            {
              	for(int h=j+1;h<n;h++)
                {
                  	if(a[i]!=a[j] && a[j]!=a[h] )
                    	{
                      		  if(a[i]+a[j]>a[h])
                          			c++;
                    	}
                }
            }
        }
System.out.println(c);
	}
}