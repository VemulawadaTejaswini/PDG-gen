/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] array = str.split(" ");
        int[] a =new int[3];
        int sum0,sum1,sum2;

        for(int i = 0; i < 3; i++){
            a[i] = Integer.parseInt(array[i]);
        }

		sum0 = a[0]+a[1];
		sum1 = a[1]+a[2];
		sum2 = a[2]+a[0];

        if(sum0<sum1 && sum0<sum2){
        	System.out.println(sum0);
        } else if(sum1<sum0 && sum1<sum2){
        	System.out.println(sum1);
        } else{
        	System.out.println(sum2);
        }
        

	}
}