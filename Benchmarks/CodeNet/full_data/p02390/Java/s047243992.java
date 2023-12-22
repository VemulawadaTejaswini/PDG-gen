import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String S;
		int time,h,m,s;
		
		Scanner in = new Scanner(System.in);
		
		S = in.nextLine();
		
		time = Integer.parseInt(S);
		
		h = time / 3600;
		m = (time - h * 3600) / 60;
		s = (time - h * 3600) % 60;
		
		System.out.println(h + ":"  + m + ":" + s);
	}
}