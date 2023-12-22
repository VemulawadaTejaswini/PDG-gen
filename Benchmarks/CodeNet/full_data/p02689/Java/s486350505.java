/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		long height[] = new long[n];
		for(int i=0;i<n;i++)
			height[i] = sc.nextInt();
		
		int mat[][] = new int[n][n];
		for(int i=0;i<m;i++){
			int a = sc.nextInt()-1,b=sc.nextInt()-1;
			mat[a][b] = mat[b][a] = 1;
		}
		
		int good = n;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j] == 1 && height[i]<=height[j]){
					good--;
					break;
				}
			}
		}
		System.out.println(good);
		
	}
}