
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
		
		int sum = arr.get(0);
		int temp = n - 2;
		int curr = 1;
		while(temp > 0)
		{
			if(temp == 1) 
			{
				sum += arr.get(curr);
				break;
			}
			else
			{
				sum += 2 * arr.get(curr);
				temp -= 2;
				curr++;
			}
		}
		
		System.out.println(sum);
		

	}

}
