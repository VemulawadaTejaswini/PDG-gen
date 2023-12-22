/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		//int count;
		 int n = scan.nextInt();
	//	 BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		 ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	//	 ArrayList<Integer> row = new ArrayList<>();
	//	 row.add(0); row.add(0);
		 HashSet<String> set = new HashSet<>();
		 for(int i = 0; i < n; i++){
//		     String[] st = rd.readLine().trim().split("\\s+");
             int a = scan.nextInt();
             int b = scan.nextInt();
		     StringBuilder sb = new StringBuilder();
		     sb.append('$');sb.append(a);sb.append('$');sb.append(b);sb.append('$');
		     if(set.add(sb.toString())){
		         ArrayList<Integer> row = new ArrayList<>();
		         row.add(a);
		         row.add(b);
		         list.add(row);
		     }
		 }
	//	 Collections.sort(list, (a,b)->Integer.compare(a.get(0), b.get(0)));
		 int maxD = 0;
		 for(int i = 0; i < list.size(); i++){
		     for(int j = i + 1; j < list.size(); j++){
		         maxD = Math.max(maxD, Math.abs(list.get(i).get(0) - list.get(j).get(0)) + Math.abs(list.get(i).get(1) - list.get(j).get(1)));
		     }
		 }
		
		 System.out.println(maxD);
	}
}
