import java.util.*;
public class Main {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int nums = sc.nextInt();
		int hold = 0;
		ArrayList<Integer> save = new ArrayList<Integer>();
		int count = 0;
		int[] sticks = new int[nums];
		for (int i= 0; i < nums; i++)
			sticks[i]=sc.nextInt();
		Arrays.sort(sticks);
		
		while (nums -- >2)
		{
			if (sticks[nums-1]==sticks[nums-2])
			{
				save.add(sticks[nums-1]);
				nums--;
				count++;
			}
			if (count>=2)
				break;
		}
		
		System.out.println(save.get(0)*save.get(1));
		
	}
	
	
	
}
