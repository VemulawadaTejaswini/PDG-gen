

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		if((Integer.parseInt(str[0])+Integer.parseInt(str[1])) % 3 == 0) {
		    System.out.println("Possible");
		}
		else {
		    System.out.println("Impossible");
		}
	}
}
