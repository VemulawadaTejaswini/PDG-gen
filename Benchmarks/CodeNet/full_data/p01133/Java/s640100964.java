import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int n, dx, dy;
	static int[] cx, cy;
	static double[] cdis;
	static int[] cgot;
	
	private static Boolean safe(double day)
	{
		int i;
		for(i = 0;i < n;i++)
		{
			if(cgot[i] == 0 && day >= cdis[i]) return false;
		}
		return true;
	}
	
	private static Boolean check(double hx, double hy, double day, int num)
	{
		int i;
		double move;
		
		for(i = 0;i < n;i++)
		{
			if(cgot[i] == 1) continue;
			
			move = distance(hx, hy, cx[i], cy[i]);
			if(!safe(day + move)) continue;
			
			if(num == 1) return true;
			
			cgot[i] = 1;
			if(check(cx[i], cy[i], day + move, num - 1)) return true;
			cgot[i] = 0;
		}
		
		return false;
	}
	
	private static double distance(double ax, double ay, double bx, double by)
	{
		double dx = ax - bx;
		double dy = ay - by;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			int hx, hy;
			
			n = sca.nextInt();
			hx = sca.nextInt();
			hy = sca.nextInt();
			dx = sca.nextInt();
			dy = sca.nextInt();
			
			if(n == 0) break;
			
			cx = new int[n];
			cy = new int[n];
			cdis = new double[n];
			cgot = new int[n];
			
			int i;
			for(i = 0;i < n;i++)
			{
				cx[i] = sca.nextInt();
				cy[i] = sca.nextInt();
				cdis[i] = distance(cx[i], cy[i], dx, dy);
				cgot[i] = 0;
			}
			
			if(check(hx, hy, 0, n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}