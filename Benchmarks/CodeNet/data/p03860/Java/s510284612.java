//package abc048b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x, count = 0;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		x = sc.nextInt();
		
		for(int i = a; i <= b; i++)
		{
			if(i % x == 0)
			{
				count += 1;
			}
			else
			{
				count += 0;
			}
		}
		System.out.println(count);

	}

}
