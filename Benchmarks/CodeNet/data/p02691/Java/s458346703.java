import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		HashMap<Long, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong() - i;
			
			if(map.containsKey(a[i]))map.put(a[i], map.get(a[i])+1);
			else map.put(a[i], 1);
		}
		
		long c = 0;
		for(int i = 0; i < n; i++)
		{
			long sum = i * -2;
			long need = sum - a[i];
			if(map.containsKey(need))c+=map.get(need);
		}
		
		System.out.println(c);
		
		
	}

}
