//package abc056b;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, w, ans = 0;
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b < a)
		{
			if(b + w < a)
			{
				ans = a - (b + w);
			}
			else
			{
				ans = 0;
			}
		}
		else if(b == a)
		{
			ans = 0;
		}
		else
		{
			if(a + w < b)
			{
				ans = b - (a + w);
			}
			else
			{
				ans = 0;
			}
		}
		System.out.println(ans);
		

	}

}
