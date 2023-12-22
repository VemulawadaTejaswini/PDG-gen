
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			arr.add(in.nextInt());
		Collections.sort(arr);
		Collections.reverse(arr);

		
		long sum = arr.get(0);
		int temp = n - 2;
		for(int i = 1; i < n; i++)
		{
			if(temp == 1)
			{
				sum += arr.get(i);
				break;
			}
			else 
			{
				sum += 2 * arr.get(i);
				temp -= 2;
			}
		}
		
		System.out.println(sum);
		

	}
}
