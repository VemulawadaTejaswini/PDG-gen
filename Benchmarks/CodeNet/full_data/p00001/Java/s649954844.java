import java.io.*; 
import java.util.*; 
public class Main
{     
	public static void main(String[] args) 
	{
         Scanner cin = new Scanner(System.in);
         int a[] = new int [10];
         for(int i=0;i<a.length;++i)
    	   a[i] = cin.nextInt();
         Arrays.sort(a);
         for(int i=a.length-1;i>a.length-4;--i)
    	   System.out.println(a[i]);
    	  
	} 
}