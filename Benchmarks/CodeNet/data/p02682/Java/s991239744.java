package Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int A = Integer.parseInt(ST.nextToken()), B = Integer.parseInt(ST.nextToken()), C = Integer.parseInt(ST.nextToken()), K = Integer.parseInt(ST.nextToken()), Sum = 0;
		Sum += Math.min(A, K);
		K -= Math.min(A, K);
		//System.out.println(K);
		if (K != 0) A = 0;
		K -= Math.min(B, K);
		if (K != 0) B = 0;
		Sum -= Math.min(C, K);
		K -= Math.min(C, K);
		C -= Math.min(C, K);
		System.out.println(Sum);
	}
}
