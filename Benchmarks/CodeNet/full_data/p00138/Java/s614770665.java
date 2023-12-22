import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double all[] = new double[24];
		HashMap<Double, Integer> allmap = new HashMap<Double, Integer>();
		for (int i = 0; i < 3; i++)
		{
			double group[] = new double[8];
			HashMap<Double, Integer> groupmap = new HashMap<Double, Integer>();
			for (int j = 0; j < 8; j++)
			{
				int num = sc.nextInt();
				double time = sc.nextDouble();
				group[j] = time;
				all[j + i * 8] = time;
				groupmap.put(time, num);
				allmap.put(time, num);
			}
			Arrays.sort(group);
			double time = group[0];
			System.out.printf("%d %.2f\n", groupmap.get(time), time);
			allmap.remove(time);
			time = group[1];
			System.out.printf("%d %.2f\n", groupmap.get(time), time);
			allmap.remove(time);
		}
		Arrays.sort(all);
		int index = 0;
		for (int i = 0; i < 2;index++)
		{
			Integer num = allmap.get(all[index]);
			if (num == null)
			{
				continue;
			}
			else
			{
				i++;
				System.out.printf("%d %.2f\n", num, all[index]);
			}
		}
	}
}