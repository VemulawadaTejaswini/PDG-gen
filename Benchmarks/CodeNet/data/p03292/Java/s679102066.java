import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);		
		int taskCost[] = new int[3];
		for(int i = 0; i< 3 ; i++)
		{
			taskCost[i] = s.nextInt();
		}
		int minCost = 0;
		Arrays.sort(taskCost);
		for(int i = 1; i>= 0; i--)
		{
			minCost = minCost + Math.abs(taskCost[i+1]-taskCost[i]);
		}
		System.out.println(minCost);

	}

}
