
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrokenDoor 
{

	public static void main(String[] args) 
	{
		new DataSet();
	}

	static class DataSet
	{
		Scanner scan = new Scanner(System.in);
		int cityNum;
		int roadNum;
		int start;
		int finish;
		ArrayList<Integer>[] cities;
		
		public DataSet()
		{
			cityNum = scan.nextInt();
			roadNum = scan.nextInt();
			start = scan.nextInt();
			finish = scan.nextInt();
			
			cities = new ArrayList[cityNum];
			for(int i = 0; i < cityNum; i++)
			{
				cities[i] = new ArrayList<Integer>();
			}
			
			
			for(int i = 0; i < roadNum; i++)
			{
				
			}
		}
	}
}
