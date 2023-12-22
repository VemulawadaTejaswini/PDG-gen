/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static int Y_MIN = 0;
	static int X_MAX = 600;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int X_TANI = sc.nextInt();
			int MENSEKI = 0;
			
			for(int i=X_TANI; i < X_MAX; i += X_TANI){
				MENSEKI += X_TANI * i * i;
			}
			
			System.out.println(MENSEKI);
        }
	}
}