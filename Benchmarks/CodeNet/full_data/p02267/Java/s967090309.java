import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<int[]> arrayList = new ArrayList<int[]>();
		
		while (in.hasNextLine())
		{
			int lineNumber = in.nextInt();
			int[] array = new int[lineNumber];
			in.nextLine();
			
			int i = 0;
			
			while (i < lineNumber && in.hasNextInt())
			{
				array[i] = in.nextInt();
				i++;
			}
			
			arrayList.add(array);
			
			if (in.hasNextLine())
			{
				in.nextLine();
			}
		}
		
		int[] qArray = arrayList.get(1);
		int[] sArray = arrayList.get(0);
		int count = 0;
		
		for (int i = 0; i < qArray.length; i++)
		{
			boolean found = false;
			int j = 0;
			while (!found && j < sArray.length)
			{
				if (sArray[j] == qArray[i])
				{
					count++;
					found = true;
				}
				j++;
			}
		}
		
		System.out.println(count);
		
	}

}
