/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner (System.in);
	  int n=s.nextInt();
	  int m=s.nextInt();
	  int r=0;
	  int t=0;
	  if(n<=m)
	  {
	      r=n;
	      for(int i=1; i<m; i++ ){
	          
	          t=n*10;
	          n=t+r;
	          
	      }
	      System.out.println(""+n);
	          
	  }
	  else
	  {
	      r=m;
	      for(int i=1; i<n; i++ ){
	          
	          t=m*10;
	          m=t+r;
	          
	      }
	      System.out.println(""+m);
	          
	  }
	  
	  
	  
	  
	}
}
