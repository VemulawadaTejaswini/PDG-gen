import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		int W = Integer.parseInt(str1Ary[0]);
		int H = Integer.parseInt(str1Ary[1]);
		int x = Integer.parseInt(str1Ary[2]);
		int y = Integer.parseInt(str1Ary[3]);
		int r = Integer.parseInt(str1Ary[4]);
		if((W >= x + r) && (H >= y + r) && (0 <= x - r) && (0 <= y - r)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}