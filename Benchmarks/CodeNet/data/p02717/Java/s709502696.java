import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Qa 
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int[] Boxes = new int[3];
		Boxes[0] = Integer.parseInt(ST.nextToken()); Boxes[1] = Integer.parseInt(ST.nextToken()); Boxes[2] = Integer.parseInt(ST.nextToken());
		int tempA = Boxes[0], tempB = Boxes[1], tempC = Boxes[2];
		Boxes[0] = tempB;
		Boxes[1] = tempA;
		tempA = Boxes[0];
		Boxes[0] = tempC;
		Boxes[2] = tempA;
		System.out.println(Boxes[0] + " " + Boxes[1] + " " + Boxes[2]);
	}
}
