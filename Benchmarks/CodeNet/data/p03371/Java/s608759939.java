import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		long A = Integer.parseInt(ST.nextToken()), B = Integer.parseInt(ST.nextToken()), C = Integer.parseInt(ST.nextToken()), X = Integer.parseInt(ST.nextToken()), Y = Integer.parseInt(ST.nextToken());
		//he buys a and b pizzas:
		long costAB = A * X + B * Y;
		long Same = Math.min(X, Y);
		X -= Same; Y -= Same;
		long costCombine = Same * 2 * C + A * X + B * Y;
		long totalCost = Same * 2 * C + Math.max(X, Y) * 2 * C;
		long Best = Math.min(costAB, costCombine);
		Best = Math.min(Best, totalCost);
		System.out.println(Best);
	}
}
