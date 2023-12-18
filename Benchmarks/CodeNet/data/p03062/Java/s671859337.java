import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int[] value = new int[n];
		
		for (int i = 0; i < n; i++) {
			value[i] = Integer.parseInt(sc.next());
		}
		
		int minuscount = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			if (value[i] < 0) minuscount++;
		}
		
		for (int i = 0; i < n; i++) {
			max += Math.abs(value[i]);
		}
		
		if (minuscount % 2 == 1) {
			int min = Math.abs(value[0]);
			
			for (int i = 0; i < n; i++) {
				if (min > Math.abs(value[i])) {
					min = Math.abs(value[i]);
				}
			}
		}
		
		System.out.println(max);
		
		
		sc.close();
	}
	
}