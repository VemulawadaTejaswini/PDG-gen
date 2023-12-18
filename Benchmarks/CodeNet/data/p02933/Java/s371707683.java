import java.awt.Polygon;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		String s = file.next();
		if(n >=3200)
			System.out.println(s);
		else
			System.out.println("red");
	}
}
