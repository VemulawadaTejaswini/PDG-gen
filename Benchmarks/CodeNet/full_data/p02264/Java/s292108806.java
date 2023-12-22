/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] str = s.split(" ");
		long count = 0;
		long timer = 0;
		int time = 0;
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		String[] name = new String[n];
		int[] array = new int[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			s = br.readLine();
			str = s.split(" ");
			name[i]=str[0];
			queue.add(Integer.parseInt(str[1]));
		}
		for(int i=0;queue.isEmpty()!=true;i++){
			time=queue.poll();
			if(time>q){
				queue.add(time-q);
				timer+=q;
			}
			else{
				timer+=time;
				System.out.println(name[i%n]+" "+timer);
			}
		}
	}
}