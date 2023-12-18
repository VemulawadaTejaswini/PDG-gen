import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int x=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<n;i++)
	   ar[i]=sc.nextInt();long count=0;
	   for(int i=1;i<n;i+=2)
	   {
	       if(ar[i]+ar[i-1]>x)
	       {
	           int gh=ar[i]+ar[i-1]-x;
	           if(ar[i]>=gh)
	           ar[i]=ar[i]-gh;
	           else
	           {
	               ar[i]=0;
	               ar[i-1]-=(gh-ar[i]);
	           }
	           count+=gh;
	       }
	       if(i+1<n&&ar[i]+ar[i+1]>x)
	       {
	           int gh=ar[i]+ar[i+1]-x;
	           if(ar[i]>=gh)
	           ar[i]=ar[i]-gh;
	           else
	           {
	               ar[i]=0;
	               ar[i+1]-=(gh-ar[i]);
	           }
	           count+=gh;
	       }
	   }
	   System.out.println(count);
	}}
	   
	   
	   
	   