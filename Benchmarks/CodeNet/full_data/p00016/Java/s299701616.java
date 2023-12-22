
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String ln[];
		double x = 0;
		double y = 0;
		double angle=Math.toRadians(90);
		String s="";
		while((s = input.readLine()) != null && !s.isEmpty()){
			ln=s.split(",");
			x += Integer.parseInt(ln[0])*Math.cos(angle);
			y += Integer.parseInt(ln[0])*Math.sin(angle);
			angle += Math.toRadians(-1*Integer.parseInt(ln[1]));	
			System.out.println(angle);
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}