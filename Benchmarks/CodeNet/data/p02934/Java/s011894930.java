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
		int N = file.nextInt();
		double[] inv = new double[N];
		for(int i = 0;i<N;i++)
		{
			inv[i] = 1/file.nextDouble();
		}
		double sum = 0;
		for(double x:inv)
			sum+=x;
		System.out.println(1/sum);
	}
}
