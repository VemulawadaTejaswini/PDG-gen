/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(sc.hasNext()){
			if(i==0){
				i = sc.nextInt();
			}else{
				String str = sc.next();
				
				str = str.replaceAll("Hoshino", "Hoshina");
				System.out.println(str);
			}
		}
	}
}