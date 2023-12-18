import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    
	    Integer a[]=new Integer[n];
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    
	    int s=0;
	    for(int i=0;i<n;i++)
	    {
	        s=s+a[i];
	    }
	     int c=0;
	     Arrays.sort(a,Collections.reverseOrder());
	     for(int i=0;i<m;i++)
	     {
	         if(a[i]>=(s/(4*m)))
	         c++;
	     }
	     if(c==m)
	     System.out.println("YES");
	     else
	     System.out.println("NO");
	   
	    
	    
	    
	}
}
