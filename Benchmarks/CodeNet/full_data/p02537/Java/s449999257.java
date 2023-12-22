/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
 class Main
{
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int i = 0;
      int flag = 0;
		while(true) {
            if(i >= a && i >= c && i <= b && i <= d) {
              flag = 1;
                break;
            }		    
            i += 5;
		}
      if(flag == 1)
		System.out.println("Yes");
      else 
        System.out.println("No");
      
	
	}
}