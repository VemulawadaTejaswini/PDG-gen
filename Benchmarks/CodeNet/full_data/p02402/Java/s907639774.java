/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        int size = Integer.parseInt(s);
        int min = 0,max = 0,sum = 0;
        s = r.readLine();
        String[] strData = /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        int size = Integer.parseInt(s);
        int min = 0,max = 0,sum = 0;
        s = r.readLine();
        String[] strData = s.split(" ");
        for (int count = 0; count < size; count++){
        		int tmp = Integer.parseInt(strData[count]);
        		if(count == 0){
        			min = max = sum = tmp;
        		} else {
        			if (min > tmp) {
        				min = tmp;
        			}
        			if (max < tmp) {
        				max = tmp;
        			}
        			sum += tmp;
        		}
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
        System.out.print(" ");
        System.out.print(sum);
        System.out.print("\n");
    }
}s.split(" ");
        for (int count = 0; count < size; count++){
        		int tmp = Integer.parseInt(strData[count]);
        		if(count == 0){
        			min = max = sum = tmp;
        		} else {
        			if (min > tmp) {
        				min = tmp;
        			}
        			if (max < tmp) {
        				max = tmp;
        			}
        			sum += tmp;
        		}
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
        System.out.print(" ");
        System.out.print(sum);
        System.out.print("\n");
    }
}