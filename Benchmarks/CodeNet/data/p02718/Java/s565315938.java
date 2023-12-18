

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); //pops
		int an = 0;
		
		
		boolean div = false;
		if(n%4 == 0 && (n%4)%m == 0)
		{
			div = true;
		}
		
		int[] a = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] * 4 * m >= sum)
				an++;
		}
		
		if(an >= m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
