import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b, c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		a = Integer.parseInt(str1Ary[0]);
		b = Integer.parseInt(str1Ary[1]);
		c = Integer.parseInt(str1Ary[2]);
		if (a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}