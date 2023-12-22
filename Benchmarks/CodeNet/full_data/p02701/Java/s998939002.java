import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		String[] array=new String[n];
		for(int i=0;i<n;i++)
		    array[i]=input.nextLine();
	    Set<String> data=new HashSet<String>();
	    for(int i=0;i<n;i++)
	        data.add(array[i]);
	   //System.out.println(data);
	   System.out.println(data.size()-1);
		input.close();
	}
}