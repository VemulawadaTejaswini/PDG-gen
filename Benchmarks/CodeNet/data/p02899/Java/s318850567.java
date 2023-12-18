import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				int c = s.nextInt()-1;
				a[c]=i+1;
			}
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
			
	}
}
